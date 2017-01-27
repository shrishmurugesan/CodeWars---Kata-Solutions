package everything;

import java.util.ArrayList;

public class ProdFib {
	
	public static long[] productFib(long prod) {
	    
		ArrayList<Long> fib = new ArrayList<>();
		long[] resultSet = new long[3];
		fib.add(0L);
		fib.add(1L);
		while(true)
		{
			long currentProd = fib.get(fib.size()-1) * fib.get(fib.size()-2);
			if(currentProd == prod)
			{
				resultSet[0] = fib.get(fib.size()-2);
				resultSet[1] = fib.get(fib.size()-1);
				resultSet[2] = 1;
				break;
			}
			if(currentProd > prod)
			{
				resultSet[0] = fib.get(fib.size()-2);
				resultSet[1] = fib.get(fib.size()-1);
				resultSet[2] = 0;
				break;
			}
			else
			{
				long nextFibNumber = fib.get(fib.size()-1)+fib.get(fib.size()-2);
				fib.add(nextFibNumber);
				continue;
			}
		}
			return resultSet;
	   }
	
	public static void main(String a[])
	{
		long[] result = productFib(1597);
		for (long l : result) {
			System.out.print(l+" ");
		}
	}

}
