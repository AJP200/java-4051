import java.io.*;

public class HandsOnFD1 {
    public static void main( String [ ] args )
{
/*----------- create the corresponding File instance ------------*/
File file = new File( args[0] );
/*----------- output the name of the file -----------------------*/
System.out.println( "Name:\t" + file.getName());
/*---------- output the pathname of the file --------------------*/
System.out.println( "Path:\t" + file.getPath( ));
/*--------- Can I write into the file ---------------------------*/
System.out.println("Can I write into the file?:\t"+file.canWrite());
/*--------- is the file a directory? ----------------------------*/
System.out.println( "Is file a directory?:\t" + file.isDirectory( ));
/*----------output the length of the file -----------------------*/
System.out.println( "Length:\t" + file.length( ));
/*---------output the pathname of the file directory-------------*/
System.out.println( "Directory:\t" + file.getParent( ));
}
}
