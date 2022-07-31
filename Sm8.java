package s1;
/*ID: 21CE103
Name: Smit patel
Github link: https://github.com/Smit103/21CE103_part1java.git
AIM :The problem is to write a program that will grade multiple-choice tests.
 Assume there are eight students and ten questions, and the answers are stored in a two-
 dimensional array. Each row records a student’s answers to the questions, as shown in the following array.
 Students’ Answers to the Questions:
                              0   1   2  3   4   5   6  7   8   9
                          Student 0  A  B  A  C  C   D  E  E  A  D
                          Student 1  D  B  A  B  C  A   E  E  A  D
                          Student 2  E  D  D  A  C  B   E  E  A  D
                          Student 3  C  B  A  E  D  C   E  E  A  D
                          Student 4  A  B  D  C  C  D  E  E  A   D
                          Student 5  B  B  E  C   C  D  E  E  A  D
                          Student 6  B  B  A  C  C  D  E   E  A  D
                          Student 7  E  B  E  C  C   D  E  E  A  D
The key is stored in a one-dimensional array:
Key to the Questions:0 1 2 3 4 5 6 7 8 9
Key D B D C C D A E A D
Your program grades the test and displays the result. It compares each student’s 
answers with the key, counts the number of correct answers, and displays it.
*/
import java.util.Scanner;

public class Sm8
{
public static void main (String[] s)
{
  Scanner sc = new Scanner (System.in);
  String[] a= { "D","B","D","C","C","D","A","E","A","D"};
  String[][] st = new String[8][10];
  System.out.println("Enter eight student's answers of 10 questions" );
  for (int i =0;i<st.length;i++)
  {
    int count =0;
    for (int j=0;j<st[i].length;j++)
    {
      st[i][j] = sc.next();
      if(st[i][j].equalsIgnoreCase(a[j]))   // Ignore case of string 
        count++;
    }
    System.out.println("Student's " + i+1 + " correct answers are " + count);
  }
  
}

}
