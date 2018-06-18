import java.util.Scanner;
class ComplexNumbers{
int realnumber;
int imaginarynumber;
public void display(int realnumber, int imaginarynumber){
int r=realnumber;
int m=imaginarynumber;
System.out.print(r+"+"+m+"i");
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.print("enter realnumber.and.imaginarynumber part");
int r1=in.nextInt();
int m=in.nextInt();
ComplexNumbers c1=new ComplexNumbers();
c1.display(r1,m);
}
}
