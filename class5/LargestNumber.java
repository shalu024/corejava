import java.util.Scanner;
class LargestNumber{
public static void main(String[] args){
int arr[]={6,4,7,5,3,8};
int largest=arr[0];
int Secondlargest=arr[0];
System.out.println("Given array:");
for(int i=0;i<arr.length; i++){
System.out.println("value:"+arr[i]);
}
for(int i=0; i<arr.length;i++){
if(arr[i]>largest){
Secondlargest=largest;
largest=arr[i];
}
else if(arr[i]>largest){
Secondlargest=arr[i];
}
}
System.out.println("Second number largest is:" +Secondlargest);
}
}
