import java.util.Arrays;

public class FunctionArray {
 
public static <E> void FunctionArray(E[] ArrayPrint ) {
for (E element : ArrayPrint )
System.out.printf("%s ", element);
System.out.println();
}

public static void main(String args[]) {
  
Character[] charArray = {'p','a','r','i','n','e','e','t'};
Double[] dblArray = { 3456.69,67372.76,6788.7,567.0 };
Integer[] intArray = { 0,3,4,5,9,6,7,3,1};
 
System.out.println("\n characterArray values contains:");
FunctionArray(charArray);

System.out.println("\n doubleArray values contains:");
FunctionArray(dblArray);

System.out.println(" integerArray values contains:");
FunctionArray(intArray);

} 
}