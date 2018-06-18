import java.util.Scanner;
import java.lang.String;

abstract class Animal{
String color;
String breed;
String name;
void Speak(){
System.out.println(" They all are Speaking");
}
abstract void eat();
}
class dog extends Animal{
dog(String color,String breed,String name){
this.color=color;
this.breed=breed;
this.name=name;
}
void me()
{
System.out.println("dog color is:"+color);
System.out.println("dog breed is:"+breed);
System.out.println("dog name is:"+name);
}
void eat()
{
System.out.println("Dog eats bones.");
}
}
class AbstractDogCat{
public static void main(String[] args)
{
Animal an=new dog("black","pug","Seffie");
dog d= new dog ("black","pug","Seffie");
d.me();
an.eat();
an.Speak();
}
}