import java.util.Scanner;
class Strc
{
public static void maim(string args[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
		int vow=0,cctr=0,nctr=0,sctr=0;
		
		String str=strN.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vctr++;
			}
			else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
			{
				nctr++;
			}
			else if(ch=='@'||ch=='!'||ch=='#'||ch=='$')
			{
				sctr++;
			}
			else if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
			{	
				if(ch==' ')
				{
					continue;
				}
				else
					cctr++;
			}
			/*
			else if(ch!=' ')
				if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
					cctr++;
			*/
			/*else if(ch!=' '|| ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
			{
				
					cctr++;
			}*/
		}
		System.out.println("VOWELS : "+vctr);
		System.out.println("CONSONANTS : "+cctr);
		System.out.println("NUMBER : "+nctr);
		System.out.println("OTHERS : "+sctr);
	}	