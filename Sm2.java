package s1;
/*ID: 21CE103
Name: Smit patel
Github link: https://github.com/Smit103/21CE103_part1java.git
AIM :Given a string, return a string made of the first 2 chars (if present), however include
first  char  only  if  it  is  'o' and  include  the  second  only  if  it  is  'z',  so  "ozymandias"
yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/
public class Sm2 {
    
    public void str(String str){
        if (str.startsWith("oz")){
        System.out.println("oz"); 
        }
        else if (str.startsWith("o"))
          System.out.println("o");
        else if (str.startsWith("z", 1))
          System.out.println("z");
        else
          System.out.println(" ");
      
}


    public static void main(String[] args) {
        
        Sm2 p1= new Sm2();
        p1.str("ozymandias");
    }
}


