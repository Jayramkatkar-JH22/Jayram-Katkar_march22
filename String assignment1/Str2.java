import java.util.*;
{
public static void main(String args[])
	{
		//String s1 = "There are three bugs and nine features";
		//String s1 = "one two three four five six seven eight  nine nine features";
		/*
		 * String[] arr=s1.split(" ");
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :  ");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		 String s2=""; String s3=""; 
		 String s4=""; String s5=""; 
		 String s6=""; String s7=""; 
		 String s8=""; String s9=""; 
		 String s10=""; String s11=""; 
		 
		 if(s1.contains("nine")) 
		 { 
			 s2=s1.replace("nine", "ten"); 
		 }
		 else s2=s1;
		 if(s2.contains("eight")) 
		 { 
			 s3=s2.replace( "eight","nine");
		 }
		 else s3=s2;
		 if(s3.contains("seven")) 
		 { 
			 s4=s3.replace( "seven","eight");
		 }
		 else s4=s3;
		 if(s4.contains("six")) 
		 { 
			 s5=s4.replace( "six","seven");
		 }
		 else s5=s4;
		 if(s5.contains("five")) 
		 { 
			 s6=s5.replace( "five","six");
		 }
		 else s6=s5;
		 if(s6.contains("four")) 
		 { 
			 s7=s6.replace( "four","five");
		 }
		 else s7=s6;
		 if(s7.contains("three")) 
		 { 
			 s8=s7.replace( "three","four");
		 }
		 else s8=s7;
		 if(s8.contains("two")) 
		 { 
			 s9=s8.replace( "two","three");
		 }
		 else s9=s8;
		 if(s9.contains("one")) 
		 { 
			 s10=s9.replace( "one","two");
		 }
		 else s10=s9;
		 if(s10.contains("zero")) 
		 { 
			 s11=s10.replace( "zero","one");
		 }
		 else s11=s10;
		 
		 System.out.println(s11);

	}