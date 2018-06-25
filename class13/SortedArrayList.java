import java.util.*;  
import java.io.*; 

 class Students{  
int rollno;  
String name;  
int age;  
Students(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;   
}  
}

 class AgeComparator implements Comparator<Students>{  
public int compare(Students st1,Students st2){  
if(st1.age==st2.age)  
return 0;  
else if(st1.age>st2.age)  
return 1;  
else  
return -1;  
}  
}  

class NameComparator implements Comparator<Students>{  
public int compare(Students st1,Students st2){  
return st1.name.compareTo(st2.name);  
}  
}  

 class SortedArrayList{ 
public static void main(String args[]){  
  
ArrayList<Students> all=new ArrayList<Students>();  
all.add(new Students(6316055,"Parineet",18));  
all.add(new Students(6316066,"Raspreet",20));  
all.add(new Students(6316062,"Rajni",21));  
  
System.out.println("By Name");  
  
Collections.sort(all,new NameComparator());  
for(Students st: all){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("By age");  
  
Collections.sort(all,new AgeComparator());  
for(Students st: all){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
}  
}  