import java.util.Scanner;

class PalinDrome{
public static void main(String[] args){
int n, reverse = 0;
System.out.println("Enter any number to reverse");
Scanner in = new Scanner(System.in);
n = in.nextInt();
while(n>0)
{
reverse = reverse *10;
reverse = reverse + n%10;
n = n/10;
}
if(reverse==n){
System.out.println("the number is "+reverse+" in palindrome");
}
else {
System.out.println("the number is "+reverse+" not in palindrome");
}
}
}
