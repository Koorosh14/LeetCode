class Solution
{
	public static int maximumWealth(int[][] accounts)
	{
		int maxWealth = 0;

		int currentCustomerWealth = 0;
		for (int[] customer : accounts)
		{
			currentCustomerWealth = 0;
			for (int wealth : customer)
				currentCustomerWealth += wealth;

			if (currentCustomerWealth > maxWealth)
				maxWealth = currentCustomerWealth;
		}

		return maxWealth;
	}

	/* public static void main(String[] args)
	{
		System.out.println(maximumWealth(new int[][] { new int [] { 1, 2, 3 }, new int [] { 3, 2, 1 } }));
		System.out.println(maximumWealth(new int[][] { new int [] { 1, 5 }, new int [] { 7, 3 }, new int [] { 3, 5 } }));
		System.out.println(maximumWealth(new int[][] { new int [] { 2, 8, 7 }, new int [] { 7, 1, 3 }, new int [] { 1, 9, 5 } }));
	} */
}
