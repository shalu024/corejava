import java.io.*;
import java.util.Arrays;

class ArraySorting{
public static<G> void printArray(G[] arr){
for(G r: arr)
System.out.printf("%s",r);
System.out.println();
}
public static void main(String[] args){

String[] Names = {"parineet", "raspreet", "Aakansha"};
Arrays.sort(Names);
System.out.println(Arrays.toString(Names));

Integer[] num = {786,897,166,356,656};
Arrays.sort(num);
System.out.println(Arrays.toString(num));

double[] lengths = {786.0, 256.5, 535.0, 8.5, 0.5};
Arrays.sort(lengths);
System.out.println(Arrays.toString(lengths));

}
}