<?php
class Solution
{
	/**
	 * @param	int			$n
	 *
	 * @return	String[]
	 */
	function fizzBuzz($n)
	{
		$result = [];

		for ($i = 1; $i <= $n; $i++)
		{
			$currentIndex = '';

			if ($i % 3 === 0)
				$currentIndex .= 'Fizz';
			if ($i % 5 === 0)
				$currentIndex .= 'Buzz';

			if (empty($currentIndex))
				$currentIndex = strval($i);

			$result[] = $currentIndex;
		}

		return $result;
	}
}
