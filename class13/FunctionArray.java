import java.util.Arrays;

public class FunctionArray {
 
public static <E> void FunctionArray(E[] ArrayPrint ) {
for (E element : ArrayPrint )
System.out.printf("%s ", element);
System.out.println();
}

public static void main(String args[]) {
  
Integer[] intArray = { 0,3,4,5,9,6,7,3,1};
Double[] dblArray = { 3456.69,67372.76,6788.7,567.0 };
Character[] charArray = {'p','a','r','i','n','e','e','t'};

System.out.println(" integerArray contains:");
FunctionArray(intArray);

System.out.println("\n doubleArray contains:");
FunctionArray(dblArray);
 
System.out.println("\n characterArray contains:");
FunctionArray(charArray);

} 
}