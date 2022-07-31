package s1;
/*ID: 21CE103
Name: Smit patel
Github link: https://github.com/Smit103/21CE103_part1java.git
AIM :Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/
public class Sm4 {
    public boolean ar123(int[] no) {
        for (int i=1; i < (no.length-1); i++) {
          if (no[i-1]==1 && no[i]==2 && no[i+1]==3) 
          return true;
        }
        return false;
      }

      public static void main(String[] args) {
        Sm4 s4=new Sm4();
        int [] num1 = {1,2,3,5};
        System.out.println(s4.ar123(num1));
        
      }
}

