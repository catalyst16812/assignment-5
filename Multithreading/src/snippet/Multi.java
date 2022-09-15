package snippet;

class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
        	double avg=0;
           for(int i=1;i<=50;i++)
           {
        	   avg=(avg+i);
        	   System.out.println("Current position is "+i);
           }
           System.out.println("*****the average is "+(avg/50)+"*****");
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
        	System.out.println("Square of "+i+" is "+i*i);
            
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