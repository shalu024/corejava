import java.util.*;
class SetsCompare{
	public static void main(String[] args){
HashSet<String>hs =new HashSet<String>();
hs.add("Raspreet");
hs.add("Rajni");
hs.add("Priyanka");
hs.add("Aakansha");
hs.add("Parineet");
hs.add("Purnima");

HashSet<String> subset =new HashSet<String>();

subset.add("Raspreet");
subset.add("Zoya");
subset.add("Rajni");
subset.add("Neet");
subset.add("Monita");
subset.add("Sonam");
hs.retainAll(subset);
System.out.println(hs);

}


    }