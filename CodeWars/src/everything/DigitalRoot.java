package everything;

public class DigitalRoot {
	
	 public static int digital_root(int n) {
		    StringBuilder sb = new StringBuilder();
		    System.out.println("Inserted: "+n);
		    int sum =0;
		    sb.append(n);
		    while(sb.length()>1)
		    {
		    sum =0;
		    for(int i=0; i<sb.length();i++)
		    {
		    	sum += Character.getNumericValue(sb.charAt(i));
		    }
		    	sb = new StringBuilder();
		    	sb.append(sum);
		    	
		    }
		    System.out.println("digital root:"+sb.toString());
		    return sum;
		  }
	 
	 public static void main(String a[])
	 {
		 System.out.println(digital_root(195));
	 }

}
