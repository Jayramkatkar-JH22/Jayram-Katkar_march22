import java.util.*;
class Strrev
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String : ");
	String str1=sc.nextLine();
	String str2="";
	int i;
	for(i=str1.length()-1;i>=0;i--)
	{
		str2=str2+str1.charAt(i);
	}
	System.out.print("the reveresed String is : ");
	
	System.out.println(str2);
}
}