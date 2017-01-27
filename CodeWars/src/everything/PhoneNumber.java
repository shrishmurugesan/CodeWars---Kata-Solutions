package everything;

public class PhoneNumber {
	
	public static String createPhoneNumber(int[] numbers) 
	{
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append(numbers[0]).append(numbers[1]).append(numbers[2]).append(")").append(numbers[3]).append(numbers[4]).append(numbers[5]).append("-").append(numbers[6]).append(numbers[7]).append(numbers[8]).append(numbers[9]);
		return result.toString();
		
	}

}
