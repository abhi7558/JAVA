import java.util.Scanner;
import java.util.Arrays;
class Sort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Strings: ");
		int size=sc.nextInt();
		String[] strings=new String[size];
		System.out.println("Enter the String: ");
		for(int i=0;i<size;i++)
		{
			strings[i]=sc.next();
		}
		System.out.println("Choose...\n1.Built-in Method\n2.User-Defined Method");
		System.out.println("Select Your Option...");
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1:
			Arrays.sort(strings);
			break;
			case 2:
			String temp;
			for(int i=0;i<size-1;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(strings[i].compareTo(strings[j])>0)
					{
						temp=strings[i];
						strings[i]=strings[j];
						strings[j]=temp;
					}
				}
			}
			break;
			default:
			System.out.println("Invalid Choice...");
			break;
		}
		for(int i=0;i<size;i++)
		System.out.println(strings[i]);
	}
}
		
		
		
		
