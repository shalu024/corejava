import java.util.Scanner;
class EvenNumber{
public static void main(String[] args){
Scanner n;
n=new Scanner(System.in);
int i,a;
a=n.nextInt();
for(i=0;i<=a;i++){
if(i%2==0){
System.out.println(i);}
else
{continue;}
}
}
}