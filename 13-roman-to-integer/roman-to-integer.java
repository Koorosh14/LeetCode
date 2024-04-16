class Solution
{
	private int result;

	public int romanToInt(String s)
	{
		this.result = 0;

		s = extractAndAddToResult(s, "CM", 900);
		s = extractAndAddToResult(s, "M", 1000);
		s = extractAndAddToResult(s, "CD", 400);
		s = extractAndAddToResult(s, "D", 500);
		s = extractAndAddToResult(s, "XC", 90);
		s = extractAndAddToResult(s, "C", 100);
		s = extractAndAddToResult(s, "XL", 40);
		s = extractAndAddToResult(s, "L", 50);
		s = extractAndAddToResult(s, "IX", 9);
		s = extractAndAddToResult(s, "X", 10);
		s = extractAndAddToResult(s, "IV", 4);
		s = extractAndAddToResult(s, "V", 5);
		s = extractAndAddToResult(s, "I", 1);

		return this.result;
	}

	private String extractAndAddToResult(String input, String romanCharacters, int valueToAdd)
	{
		String newString = input.replace(romanCharacters, "");
		this.result += (valueToAdd * (input.length() - newString.length())) / romanCharacters.length();

		return newString;
	}
}
