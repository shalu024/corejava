import java.util.Scanner;

class ReverseNumber{
public static void main(String[] args){
int n=156;
int original=n;
int reverse=0;
int remainder;

while(original !=0){
remainder = original % 10;

reverse = reverse *10 + remainder;
original= original/10;
n = n/10;
}

System.out.println("Reverse of the number is "+ reverse);
}
}