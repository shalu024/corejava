import java.util.Scanner;
 
public class RemoveVowels
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter any string");
         
        String inputString = sc.nextLine();
         
        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
         
        
        
        System.out.println("string is without vowels");
         
        System.out.println(newInputString);
         
        sc.close();
    }
}