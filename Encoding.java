import java.util.*;
class Encoding
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);//111=aaa ,1 11=ak ,11 1=ka 
		String str=".abcdefghijklmnopqrstuvwxyz";	
		char a[]=str.toCharArray();		
		int n=a.length,k=0;					
		System.out.println("Enter the input");
		String input=scn.nextLine();//111
		char p[]=input.toCharArray();
		int len=p.length;
		char []temp=new char[len];
		for(int i=0; i<n; i++)
		{
			if(p[k++]==i)
			{
				temp[k]=a[i];
				i=0;
				if(k==len)
				{
					
			}
		}
		for(int i=0; i<len-1; i++)
		{
			System.out.println(temp[i]);
		}
	}
}
		/*while(input>0)
		{
			int num=input%10;
			for(int i=0; i<p.length; i++)
			{
				temp[i]=a[num];
			}
		for(int i=0; i<p.length; i++)
		{
			System.out.println(temp[i]);
		}
		}
	}
}
		*/
		
