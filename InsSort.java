import java.io.*;
import java.util.*;

class InsSort
{
	public static void main(String ... args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total numbers kitna hoga");
		int q = s.nextInt();
		int [] a=new int[q];
		System.out.println ("Ab number daalne ka ");
		for(int i = 0;i<q;i++)
		{
			a[i] = s.nextInt();
		}
		int m=0;
		for(int i=1;i<q;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[i])
				{
					int temps = a[j];
					a[j] = a[i];
					a[i]=temps;
				}	 
			}
		}
		for(int i=0;i<q;i++)
		{
			System.out.println(a[i]);
		}
	}
}