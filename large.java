import java.util.Scanner;

class large
{
public static void main(String args[])
{
int b,c;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
 b=s.nextInt();
 c=s.nextInt();

int d=(a>b)? (a>c)?a:c : (b>c)?b:c;
System.out.print(d);

}

}



