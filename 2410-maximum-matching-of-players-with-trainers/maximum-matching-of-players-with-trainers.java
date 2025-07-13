import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution
{
	public static int matchPlayersAndTrainers(int[] players, int[] trainers)
	{
		int matches = 0;

		Arrays.sort(players);
		Arrays.sort(trainers);

		for (int player : players)
		{
			for (int i = 0; i < trainers.length; i++)
			{
				// Skip already matched trainers
				if (trainers[i] == -1)
					continue;

				if (player <= trainers[i])
				{
					matches++;
					trainers[i] = -1; // Mark trainer as matched
					break;
				}
			}
		}

		return matches;
	}

	/* public static void main(String[] args)
	{
		System.out.println(matchPlayersAndTrainers(new int[] { 4, 7, 9 }, new int[] { 8, 2, 5, 8 }));
		System.out.println(matchPlayersAndTrainers(new int[] { 1, 1, 1 }, new int[] { 10 }));
		System.out.println(matchPlayersAndTrainers(new int[] { 1, 1000 }, new int[] { 1000, 1 }));
	} */
}
