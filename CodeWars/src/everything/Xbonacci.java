package everything;

import java.util.ArrayList;

public class Xbonacci {

	public double[] tribonacci(double[] s, int n) {
	     
		if(n == 0)
		{
			double[] result = {0};
			return result;
		}
		ArrayList<Double> result = new ArrayList<>();
		
		int NmbrElements = 3;
		for (double d : s) {
			result.add(d);
		}
		
		while(NmbrElements<n)
		{
			result.add(result.get(result.size()-1)+result.get(result.size()-2)+result.get(result.size()-3));
		}
		
		double[] resultArray = new double[result.size()];
		int point =0 ;
		for (double d : result) {
			resultArray[point] = d;
			point++;
		}
		
		return resultArray;
	  }
	
}
