package everything;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class DoubleLinear {
	
	 public static int dblLinear (int n) {
	        ArrayList<Integer> u = new ArrayList<>();
	        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
	        int listIndex = 0;
	        while(listIndex < n)
	        {
	        	if(u.size()==0)
	        	{
	        		u.add(1);
	        		u.add(2*1+1);
	        		u.add(3*1+1);
	        		listIndex++;
	        	}
	        	else if(listIndex < u.size())
	        	{
	        		int holder = u.get(listIndex);
	        		u.add(holder*2+1);
	        		u.add(holder*3+1);
	        		Collections.sort(u);
	        		listIndex++;
	        	}
	        	
	        }
	        for (Integer integer : u) {
				System.out.print(integer+",");
			}
	        hs.addAll(u);
	        u.clear();
	        u.addAll(hs);
	        System.out.println(u.get(n));
	        return u.get(n);
	    }
	 
	 public static void main(String a[])
	 {
		 System.out.println(dblLinear(20));
	 }

}
