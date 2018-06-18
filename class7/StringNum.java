import java.util.Scanner;
import java.lang.String;

class StringNum{
public static void main(String[] args){
 
Scanner sc;
sc= new Scanner(System.in);
System.out.println("Enter three string number as input");


String a=sc.next();
String b=sc.next();
String c=sc.next();

int temp1=Integer.valueOf(a);
int temp2=Integer.valueOf(b);
int temp3=Integer.valueOf(c);
int sum=temp1+temp2+temp3;
System.out.println("final result"+sum);
if (Integer.valueOf(a)>Integer.valueOf(b)){
System.out.println("Greatest number is"+a);
}
else{
System.out.println("Greatest number is"+b);
}
}
}