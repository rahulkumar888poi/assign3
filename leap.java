import java.util.Scanner;

class leap
{
public static void main(String args[])
{
 int num;
 
Scanner s=new Scanner(System.in);
num=s.nextInt();

if((num%4==0)||(num%400==0))
{
	
	System.out.print("Leap year");
}
else
{
	System.out.print("Not Leap year");
}

}

}



