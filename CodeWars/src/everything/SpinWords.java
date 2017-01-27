package everything;

public class SpinWords {

	  public String spinWords(String sentence) {
	    String[] words = sentence.split(" ");
	    
	    for (int i = 0; i < words.length; i++) 
	    {
			
			if(words[i].length()>=5)
			{
				String temp = "";
				for(int j = words[i].length()-1;j>=0;j--)
				{
					temp+=words[i].charAt(j);
					
				}
				words[i]=temp;
			}
			
		}
		
	    StringBuilder sb = new StringBuilder();
	   for (int i = 0; i < words.length; i++) 
	   {
		if(i != words.length-1)
		{
			sb.append(words[i]+" ");
		}
		
		if(i == words.length-1)
		{
			sb.append(words[i]);
		}
		
    	}
	    
	    return sb.toString();
	    
	  }
}