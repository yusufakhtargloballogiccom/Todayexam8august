import java.util.ArrayList;

import java.util.Iterator;

public class Main {

public static void main(String[] args) {

 Country c= new Country();

// insertion

 c.saveCountryCapital("India","Delhi");

 c.saveCountryCapital("Japan","Tokyo");

//	for printing All Details of above

 c.dis();

// for finding Capitals

 System.out.println("_______*****_________");

 System.out.println("FIND CAPITAL");

 System.out.println(c.getCapital("India"));

 System.out.println(c.getCapital("Britian"));

//	for finding Country

 System.out.println("_______******____________");

 System.out.println("FIND COUNTRYy ");

 System.out.println(c.getCountry("Tokyo"));

 System.out.println(c.getCountry("Britian"));

// for converting MAp to another Map Using Value and Key;

 System.out.println("________******____________");

 System.out.println();

 System.out.println("AFTER COVERTING   KEY TO VALUR and VALUE TO KEY");

 System.out.println("____*********_________");

 c.KeyValueReverse();

// for Printing ArrayList

 System.out.println();

 ArrayList<String>st=c.AddCountry();

 System.out.println("PRINTING ARRAY LIST");

 System.out.println("__________********______");

 Iterator itr=st.iterator();

 while(itr.hasNext())

 {

 System.out.println(itr.next());

 }

}

}