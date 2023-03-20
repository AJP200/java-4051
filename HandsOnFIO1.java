import java.io.*;
public class HandsOnFIO1 {
    public static void main(String args[])
{
InputStream input;
try
{
// Create an input stream
if (args.length == 1) // reading from the specified text file
input = new FileInputStream(args[0]);
else // read from the keyboard (standard input)
input = System.in;
// Read the bytes of data until end of file (EOF) is reached
int data = input.read();
while (data != -1)
{
// Send byte to standard output
System.out.print( data );
data = input.read();
}
// Close the file
input.close();
}
catch (IOException ioe)
{
System.err.println ("I/O error - " + ioe);
}
}
}
