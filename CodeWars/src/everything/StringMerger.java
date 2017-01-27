package everything;

public class StringMerger {
	
	public static boolean isMerge(String s, String part1, String part2) {
		int stringPointer = 0;
		int sub1 = 0;
		int sub2 = 0;
		
		boolean truth = true;
		
		while(truth==true && stringPointer<s.length() && sub1<part1.length() && sub2<part2.length())
		{
			if(s.charAt(stringPointer)==part1.charAt(sub1))
			{
				stringPointer++;
				sub1++;
			}
			else if(s.charAt(stringPointer)==part2.charAt(sub2))
			{
				stringPointer++;
				sub2++;
			}
			
			else
				truth = false;
		}
		
		while(sub1 < part1.length() && truth==true)
		{
			if(s.charAt(stringPointer)==part1.charAt(sub1))
			{
				stringPointer++;
				sub1++;
			}
			else
				truth = false;
		}
		
		while(sub2 < part1.length() && truth==true)
		{
			if(s.charAt(stringPointer)==part2.charAt(sub2))
			{
				stringPointer++;
				sub2++;
			}
			else
				truth = false;
		}
		
		return truth;
	    }
	
	public static void main(String a[])
	{
		boolean result = isMerge("codewars","code","wars");
		System.out.println(result);
	}
	

}
