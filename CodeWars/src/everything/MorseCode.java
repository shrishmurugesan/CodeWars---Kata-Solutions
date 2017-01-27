package everything;

public class MorseCode {
	
	public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String[] words = morseCode.trim().split("   ");
        StringBuilder sb = new StringBuilder();
        
        for (String string : words) 
        {
		
        	String[] letters = string.split(" ");
        	for (String letter : letters) {
				sb.append(MorseCode.get(letter));
			}
        	sb.append(" ");
		}
        
        return sb.toString().trim();
    }

}
