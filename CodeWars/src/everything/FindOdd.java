package everything;
import java.util.*;
import java.util.Map.Entry;
public class FindOdd {
	
	public static int findIt(int[] A) {
		  
	    HashMap<Integer,Integer> hmap = new HashMap<>();
	    int odd = 0;
	    for(int a : A)
	    {
	        if(hmap.containsKey(a))
	        {
	          hmap.put(a, hmap.get(a)+1);
	        }
	        else
	        {
	        	hmap.put(a, 1);
	        }
	    }
	    
	    
		for (Entry<Integer,Integer> i : hmap.entrySet()) {
			if(i.getValue()%2 != 0)
			{
				odd = i.getValue();
			}
		}
		
		
	  	return odd;
	  }

}
