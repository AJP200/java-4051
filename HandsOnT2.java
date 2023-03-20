import java.lang.Thread;

class FirstThreadT extends Thread
{
 //This method will be executed when this thread is started
 public void run( )
 {
 // get the name of the current thread: (Thread.currentThread( )) could be replaced with this
 String treadName = (Thread.currentThread( )).getName( );
 //Looping from 1 to 5 to display numbers from 1 to 5
 for ( int i=1; i<=5; i++)
 {
 //Displaying the numbers from this thread
 System.out.println( "Messag from Thread : " + treadName + "\t:" +i );
 // taking a delay of one second before displaying next number
 try
 {
 Thread.sleep (1000);
 }
 catch (InterruptedException interruptedException)
 {
 /*Interrupted exception will be thrown when a sleeping or waiting thread is interrupted. */
 System.out.println( "First Thread is interrupted when it is sleeping" + interruptedException);
 }
 }
 }
}


class SecondThreadT extends Thread
{
 //This method will be executed when this thread is started
 public void run( )
 {
 // get the name of the current thread
String treadName = (Thread.currentThread( )).getName( );
 //Looping from 1 to 5 to display numbers from 1 to 5
 for ( int i=1; i<=5; i++)
 {
 //Displaying the numbers from this thread
 System.out.println( "Messag from Thread : " + treadName + "\t:" +i );
//taking a delay of two second before displaying next number
 try
 {
 Thread.sleep (2000);
 }
 catch (InterruptedException interruptedException)
 {
 /*--Interrupted exception is thrown when a sleeping or waiting thread is interrupted.---*/
 System.out.println( "Thread is interrupted when it is sleeping" + interruptedException);
 }
 }
 }
} 

public class HandsOnT2 {
    public  static  void  main( String[ ] args )

    {

             System.out.println( "I am about to create threads");

             /*--------- create both threads ------------------------ */

             FirstThreadT  thread1  =  new  FirstThreadT(  );

             SecondThreadT   thread2  =  new  SecondThreadT(   );

     System.out.println(  " Threads are created and will start soon");

     /*-------------  start both threads-----------------*/

     thread1.start(  );

     thread2.start(  );

     //Looping from 1 to 5 to display numbers from 1 to 5     

     for ( int i=1; i<=5; i++)      

     {          

          //Displaying the numbers from the thread that executes method main        
         System.out.println( "Messag from Thread :"  + (Thread.currentThread()).getName() + "\t:");

//  taking a delay of one second before displaying next number                

          try           

          {              

              Thread.sleep (4000);            

          }          

          catch (InterruptedException interruptedE)          

          {              

                  /*Interrupted exception: a sleeping or waiting thread is interrupted.   */

                 System.out.println("Thread is interrupted when it is sleeping"+ interruptedE);                          }

              }  

}

}
