import java.lang.*;
//This class defines the code of a thread by implementing the "Runnable" interface.
class FirstThreadR implements Runnable
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
 // taking a delay of one second before displaying next number
 try
 {
 Thread.sleep (1000);
 }
 catch ( InterruptedException interruptedException )
 {
 /*--Interrupted exception is thrown when a sleeping or waiting thread is interrupted.---*/
 System.out.println( "First Thread is interrupted while it is sleeping" + interruptedException);
 }
 }
 }
}
//This class defines the code of a thread by implementing the "Runnable" interface.
class SecondThreadR implements Runnable
{
 //This method will be executed when this thread is started
 public void run()
 {
 // get the name of the current thread
String treadName = (Thread.currentThread( )).getName( );
 //Looping from 1 to 5 to display numbers from 1 to 5
 for ( int i=1; i<=5; i++)
 {
 //Displaying the numbers from this thread
 System.out.println( "Messag from Thread : " + treadName + "\t:" +i );
 //take a delay of one second before displaying next number
 try
 {
 Thread.sleep (2000);
 }
 catch (InterruptedException interruptedException)
 {
 /*--Interrupted exception is thrown when a sleeping or waiting thread is interrupted.---*/
 System.out.println( "Thread is interrupted when it is sleeping" + interruptedException );
 }
 }
 }
} 
/*------------ create three threads: the first two executing the code defined in the class FirstThreadR, and
the last one executing the code defined in the class SecondThreadR----------------------------------*/
public class HandsOnT1
{
public static void main( String[ ] args )
{
System.out.println( "I am about to create threads");
/*--------- create three threads ------------------------ */
FirstThreadR task1 = new FirstThreadR( );
Thread thread1 = new Thread( task1, "first" );
FirstThreadR task2 = new FirstThreadR( );
Thread thread2 = new Thread( task2, "second" );
SecondThreadR task3 = new SecondThreadR( );
Thread thread3 = new Thread( task3, "third" );
System.out.println( " Threads are created and will start soon");
/*------------- start all three threads-----------------*/
thread1.start( );
thread2.start( );
thread3.start( );
System.out.println(" main is done");
 }
}