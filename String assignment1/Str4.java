//4. Given a string, print the first non-repeating character in the string.
	//    Input: "aabbccdeeff", Output: d
	//    Input: "aabbccddeeffgg", Output: "Not found"
	
	void Ques04()
	{
		Scanner sc=new Scanner(System.in);
        	String s=sc.nextLine();
            	char arr[]=s.toCharArray();
            	int x=arr.length,count=0;
            	char y=' ';
            
            	for(int i=1;i<x-1;i++)
            	{
            		if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
                	{
                		y=arr[i];
                   		count++;
                   		break;
                	}
            	}
                if(count==1)
                   	System.out.println(y);
                else
                   	System.out.println("Not found");
	}