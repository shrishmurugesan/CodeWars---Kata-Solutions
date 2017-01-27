package everything;

import java.util.*;

public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
		
		List<Integer> result = new ArrayList<>();
		
		if(lng==wdth)
			return null;
		
		else
		{
		
		result.addAll(sqInRectRecur(lng,wdth));
		
		return result;
		}
	}
	
	public static List<Integer> sqInRectRecur(int lng, int wdth)
	{
	List<Integer> result = new ArrayList<>();
		
		if(lng == wdth)
		{
			result.add(lng);
			return result;
		}
		int min = Math.min(lng, wdth);
		int newWidth = Math.max(lng, wdth) - min;
		result.add(min);
		result.addAll(sqInRectRecur(min,newWidth));
		
		return result;
	}

}
