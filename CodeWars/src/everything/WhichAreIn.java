package everything;

import java.util.TreeSet;

public class WhichAreIn {
	
	public static String[] inArray(String[] array1, String[] array2) 
	{
		TreeSet<String> tset = new TreeSet<>();
		for (String s1 : array1) 
		{
			for (String s2 : array2) {
				
				if(s2.contains(s1))
				{
					tset.add(s1);
				}
				
			}
		}
		
		String[] result = tset.toArray(new String[tset.size()]);
		 return result;
	}

}
