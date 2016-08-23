package com.tushar.raje.org.linkedHashMap;

public class LinkedHashMapTusharTest {
    
   public static void main(String[] args) {
	   LinkedHashMapCustomTushar<Integer, Integer> lHM = new LinkedHashMapCustomTushar<Integer, Integer>();

	   lHM.put(21, 12);
	   lHM.put(25, 121);
	   lHM.put(30, 151);
	   lHM.put(33, 15);
	   lHM.put(35, 89);

          System.out.println("Display values corresponding to keys>");
          System.out.println("value corresponding to key 21="
                       + lHM.get(21));
          System.out.println("value corresponding to key 51="
                       + lHM.get(51));

          System.out.print("Displaying : ");
          lHM.display();

          System.out.println("\n\nvalue corresponding to key 21 removed: "
                       + lHM.remove(21));
          System.out.println("value corresponding to key 22 removed: "
                       + lHM.remove(22));

          System.out.print("Displaying : ");
          lHM.display();

   }
}
