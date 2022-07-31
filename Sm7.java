package s1;
/*ID: 21CE103
Name: Smit patel
Github link: https://github.com/Smit103/21CE103_part1java.git
AIM : Display numbers in a pyramid pattern.
              1 
            1 2 1 
          1 2 4 2 1 
        1 2 4 8 4 2 1 
      1 2 4 8 16 8 4 2 1 
    1 2 4 8 16 32 16 8 4 2 1 
  1 2 4 8 16 32 64 32 16 8 4 2 1 
1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
*/

public class Sm7 {

	 public static void main(String[] args) {

	        for(int i=1;i<=8;i++)//loop for the total number of rows. 
	        {
	            for(int j=8;j>i;j--) 
	            {
	                System.out.print("  ");

	            }
	            int k=1;
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print(k+" ");
	                k = k * 2;
	            }
	            k=k/4;
	            for (int j=1;j<i;j++)
	            {
	                System.out.print(k+" ");
	                k = k / 2;
	            }
	                System.out.println();
	        }
	    }
	}
