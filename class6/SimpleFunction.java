class SimpleFunction{
void print()
{
System.out.println("null");
}
void print(int n){
System.out.println(n);
}
void print(float n){
System.out.println(n);
}
}

class Overloading{
public static void main(String[] args){
SimpleFunction c = new SimpleFunction();
c.print(8);
c.print(8f);
c.print();
}
}