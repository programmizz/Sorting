import java.io.* ;
import java.util.*;

class Lftrtr
{
	public static void main (String ... args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the limitting number ");
	int b = s.nextInt();
	System.out.println("Enter the array number ");
	int n = s.nextInt();
	int[] a = new int[n];
	System.out.println("Enter the numbers ");
	for(int i=0 ; i<n;i++)
	{
		a[i] = s.nextInt();
	}
	for(int i=0 ; i<n/2;i++)
	{
		int temp = a[i];
		a[i] = a[n-i-1];
		a[n-i-1] = temp ;
	}
	int q = n-b;
	int e = q ; 
	for ( int i =0 ; i <e-1 ; i++,e--)
	{
		int tem = a[i];
		a[i] = a[e-1];
		a[e-1] = tem ;
	}
	int z =q;
	for(int j=n-1;j>z;j--,z++)
	{
		int temp = a[j];
		a[j] = a[z];
		a[z] = temp ;
	}

	for(int i=0 ; i<n;i++)
	{
		System.out.println(a[i]); 
	}

}
}