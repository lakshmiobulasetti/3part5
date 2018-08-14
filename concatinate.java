import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the firststring");
	String firstStr=sc.next();
	System.out.println("enter the secondstring");
	String secondStr=sc.next();
	System.out.println("result after concatination");
	System.out.println(firstStr+""+secondStr);
	}
}
