import java.util.*;
class Q15
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Input First number: ");
	int a= sc.nextInt();
	
	System.out.print("Input Second number: ");
	int b= sc.nextInt();
	
	int c=a;
	a=b;
	b=c;
	System.out.println("number after swapping = ");
	
	
	System.out.println("first no. ="+a);
	System.out.println("second no. ="+b);

}
}
