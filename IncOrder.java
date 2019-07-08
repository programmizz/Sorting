import java.io.*;
import java.util.*;

class IncOrder
{
	public static void main ( String ... args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total numbers kitna hoga");
		int q = s.nextInt();
		int [] a=new int[q];
		for(int i = 0;i<q;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=q-1 ; i>0;i--)
		{
		for(int j=0;j<i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
		}
		for(int i=0;i<q;i++)
		{
			System.out.println(a[i]);
		}
	}
}