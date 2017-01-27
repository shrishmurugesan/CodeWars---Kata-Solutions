package everything;

import java.util.ArrayList;

public class SumOfMultiples {
	
	 public int solution(int number) {
		    ArrayList<Integer> multiples = new ArrayList<>();
		    for(int i=0;i<number;i++)
		    {
		      if(i%3 == 0 || i%5==0)
		      {
		        multiples.add(i);
		      }
		    }
		    int integerSum = 0;
		    for (Integer integer : multiples) {
		    	System.out.println(integer);
				integerSum += integer;
			}
		    
		    return integerSum;
		    
		    
		  }
	 
	 public static void main(String a[])
	 {
		 SumOfMultiples bleh =new SumOfMultiples();
		 System.out.println(bleh.solution(10));
	 }

}
