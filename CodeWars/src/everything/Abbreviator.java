package everything;

public class Abbreviator {

  public static String abbreviate(String string) {
    String[] words = string.split(" |-|!");
    String[] abbr = new String[words.length];
    for(int i=0;i<words.length;i++) {
		if(words[i].length()>=4)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(words[i].charAt(0));
			sb.append(words[i].length()-2);
			sb.append(words[i].charAt(words[i].length()-1));
	//		abbr[i] = sb.toString();
		}
		else
		{
			abbr[i] = words[i];
		}
	}

    int index = 0;
    int stringArrayIndex = 0;
    StringBuilder resultBuilder = new StringBuilder();
   // System.out.println(words.length+" input string length"+string.length());
    try{
    while(index < string.length())
    {
    	resultBuilder.append(abbr[stringArrayIndex]);
    	index += words[stringArrayIndex].length();
    	if(index < string.length())
    	resultBuilder.append(string.charAt(index));
    	index++;
    	stringArrayIndex++;
    	
    }
    }catch(Exception e)
    {
    	System.out.println(e);
    }
    System.out.println(resultBuilder.toString());
    return resultBuilder.toString();
  }
  
  public static void main(String a[])
  {
	  String test = "internationalization";
	  System.out.println(test.charAt(0));
	  abbreviate(test);
  }

}