import java.io.* ;
import java.util.*;

class BubbleSort
{
public static void main (String ... args)
{
Scanner s = new Scanner(System.in);
int[] a = new int[10];
System.out.println("Enter the number ");
for(int i=0 ; i<10;i++)
{
a[i] = s.nextInt();
}
for(int i=0;i<10;i++)
{
for(int j=1;j<10-i;j++)
{
if(a[j-1] > a[j])
{
int temp = a[j-1];
a[j-1] = a[j];
a[j] = temp ; 
}
}
}
System.out.println("Heyyy");
for(int i=0 ; i<10;i++)
{
System.out.println(a[i]);
}
}
}