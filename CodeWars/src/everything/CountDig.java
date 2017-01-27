package everything;


public class CountDig {
    
    public static int nbDig(int n, int d) 
    {
       int[] k = new int[n+1]; 
       int[] squareK = new int[k.length];
       int count=0;
       String digit = Integer.toString(d);
       System.out.println("the digit to be searched is "+digit);
       String test = "123";
       if(digit.charAt(0)==test.charAt(0))
       {
    	   System.out.println("testing if .equals(charAt() works");
       }
       for(int i=0;i<k.length;i++)
       {
    	   k[i] = i;
       }
       
       for(int i=0;i<k.length;i++)
       {
    	   squareK[i] = k[i] * k[i];
       }
       
       for (int i : squareK) 
       {
		StringBuilder sb = new StringBuilder();
		sb.append(i);
		for(int j=0 ; j < sb.length(); j++)
		{
			if(digit.charAt(0)==sb.charAt(j))
			{
				count++;
			}
		}
		
		
    	}
       return count;
    }
    
    public static void main(String a[])
    {
    	nbDig(25,1);
    }
}