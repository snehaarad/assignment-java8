package Javaassignment;

interface A
{
void max(int a[]);
}
public class maxnum 
{
	
	public static void main(String[] args)
	{
	A aa = (a) -> {
	int n = a.length;
	for(int i = 0 ; i < n ; i++)
	{
	for(int j = i + 1 ; j < n ; j++)
	{
	if(a[i] > a[j])
	{
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp ;
	}
	}
	}
	System.out.println("Maximum NO : "+a[n - 1]);
	for(int k = 1 ; k <= 5 ; k++)
	{
	System.out.println("Largest : "+k+" "+a[n-k]);
	}
	};
	int a[] = {100, 87, 67, 68, 56,80,120};
	aa.max(a);
	}
	}



	
		
			
			
		











