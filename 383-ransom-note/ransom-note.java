class Solution
{
	public boolean canConstruct(String ransomNote, String magazine)
	{
		int foundIndex = -1;
		for (int i = 0; i < ransomNote.length(); i++)
		{
			foundIndex = magazine.indexOf(ransomNote.charAt(i));
			if (foundIndex == -1)
				return false;

			magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)), "");
		}

		return true;
	}
}
