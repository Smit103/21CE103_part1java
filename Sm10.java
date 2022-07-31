package s1;
/*ID: 21CE103
Name: Smit patel
Github link: https://github.com/Smit103/21CE103_part1java.git
AIM : Implement Ceaser cipher
*/
import java.util.Scanner;      
public class Sm10
{  
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";   
    public static String encryptData(String inputStr, int shiftKey)   
    {  
        inputStr = inputStr.toLowerCase();   
        String encryptStr = "";   
          
        
        for (int i = 0; i < inputStr.length(); i++)   
        {   
            
            int pos = ALPHABET.indexOf(inputStr.charAt(i));  
            int ep = (shiftKey + pos) % 26;   
            char encryptChar = ALPHABET.charAt(ep);   
            encryptStr += encryptChar;   
        }    
        return encryptStr;   
    }   
    public static String decryptData(String inputStr, int shiftKey)   
    {   
        inputStr = inputStr.toLowerCase();    
        String decryptStr = "";     
        for (int i = 0; i < inputStr.length(); i++)   
        {    
            int pos = ALPHABET.indexOf(inputStr.charAt(i));   
            int dp = (pos - shiftKey) % 26;   
            if (dp < 0){   
                dp = ALPHABET.length() + dp;   
            }   
            char decryptChar = ALPHABET.charAt(dp);  
            decryptStr += decryptChar;   
        }   
        return decryptStr;   
    }   
    public static void main(String[] args)   
    {   
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a string for encryption using Caesar Cipher: ");   
        String inputStr = sc.nextLine();   
          
        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");   
        int shiftKey = Integer.valueOf(sc.nextLine());   
          
        System.out.println("Encrypted Data -> "+encryptData(inputStr, shiftKey));   
        System.out.println("Decrypted Data -> "+decryptData(encryptData(inputStr, shiftKey), shiftKey));   
          
        sc.close();   
    }   
}   