package everything;

public class TenMinWalk {

	public static boolean isValid(char[] walk) {
		
		if(walk.length != 10)
			return false;
		
		int displacementNorth = 0;
		int displacementEast = 0;
		
		for (char c : walk) {
			if(c == 'n')
				displacementNorth++;
			if(c== 's')
				displacementNorth--;
			if(c == 'w')
				displacementEast--;
			if(c == 'e')
				displacementEast++;
		}
		
		if(displacementNorth==0 && displacementEast==0)
			return true;
		else
			return false;
	  }
}
