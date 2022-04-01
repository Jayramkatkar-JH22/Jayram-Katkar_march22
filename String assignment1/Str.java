import java.util.*;
class Strrev
{
public static void main(String args[])
{
	String str1="edcba";
	String str2="";
	int i;
	for(i=str1.length()-1;i>=0;i--)
	{
		str2=str2+str1.charAt(i);
	}
	//String str3=str1+str2;
	System.out.println(str2);
}
}