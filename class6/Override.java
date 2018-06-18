public class Override
{
String breed;
String color;
void Speak()
{
System.out.println("Growl");
}
public static void main(String[] args)
{
Override Object1 = new Override();
Dog Object2=new Dog();
Cat Object3=new Cat();

Object1.Speak();
Object2.Speak();
Object3.Speak();
}
}
class Dog extends Override
{
String breed;
String color;
void Speak(){
System.out.println("Bark");
}
}
class Cat extends Override
{
String breed;
String color;
void Speak(){
System.out.println("Meow");
}
}
