package snippet;

class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
        	int avg=0;
           for(int i=1;i<=50;i++)
           {
        	   avg=(avg+i)/2;
        	   System.out.println("Current position is "+i+" and the average is "+avg);
           }
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
class MultithreadingDemo2 implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            for(int i=0;i<=50;i++)
        	System.out.println(i*i);
            
            }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
// Main Class
public class Multi {
    public static void main(String[] args)
    {
     
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
            Thread object2 = new Thread(new MultithreadingDemo2());
            object2.start();
            
        
    }
}