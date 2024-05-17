class Solution
{
	public static int[] runningSum(int[] nums)
	{
		int[] result = new int[nums.length];

		// Copy the first index and make sure `nums` has more than 1 index before looping it
		result[0] = nums[0];
		if (nums.length == 1)
			return result;

		for (int i = 1; i < nums.length; i++)
			result[i] = result[i - 1] + nums[i];

		return result;
	}

	/* public static void main(String[] args)
	{
		int[] result = runningSum(new int[] { 3, 1, 2, 10, 1 });
		for (int i : result)
			System.out.println(i);
	} */
}
