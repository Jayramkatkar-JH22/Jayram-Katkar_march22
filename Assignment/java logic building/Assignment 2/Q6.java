import java.util.*;
class Q6
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Input First number: ");
	int a= sc.nextInt();
	
	System.out.print("Input Second number: ");
	int b= sc.nextInt();
	
	int c=a+b;
	System.out.println(a+" + "+b+" = "+c);
	
	c=a*b;
	System.out.println(a+" x "+b+" = "+c);
	
	c=a-b;
	System.out.println(a+" - "+b+" = "+c);
	
	c=a/b;
	System.out.println(a+" / "+b+" = "+c);
	
	c=a%b;
	System.out.println(a+" mod "+b+" = "+c);

}
}
