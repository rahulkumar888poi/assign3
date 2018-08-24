import java.util.Scanner;

class palidrome
{
public static void main(String args[])
{
int b,d;
int c=0;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
 d=a;
while(a>0)
{
b=a%10;
a=a/10;	
c=c*10+b;	
}

if(d==c)
{
System.out.print("palidrome number");	
}
else
{
	System.out.print("Not palidrome number");
	
}


}

}



