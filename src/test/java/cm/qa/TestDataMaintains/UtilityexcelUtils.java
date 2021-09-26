package cm.qa.TestDataMaintains;

import java.util.ArrayList;
import java.util.List;

public class UtilityexcelUtils {

	
	public static int []  getData(int [] a)
	{
		
		System.out.println(a);
		int b []= {2,3,4,5,6,7,98};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		return  b;
		
		
		
		
	}
	
	public static void main(String [] ar)
	{
		
		int a[]= {2,3,4,5,6,7};
		
		int [] c=getData(a);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
	}
	
	
}
