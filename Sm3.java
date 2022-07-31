package s1;
/*ID: 21CE103
Name: Smit patel
Github link: https://github.com/Smit103/21CE103_part1java.git
AIM :Given two non-negative int values, return true if they have the same last digit, such
as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
10 is 7.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/
import java.util.*;

public class Sm3 {
	
	public static boolean lastDigit (int x,int y) {
		//% with 10 will give us the last digit.
		if((x % 10) == (y % 10)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking input for both the numbers from the user.
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(lastDigit(a,b));
	}

}