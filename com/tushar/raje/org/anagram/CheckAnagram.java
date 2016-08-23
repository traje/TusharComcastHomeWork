/**
 * 
 */
package com.tushar.raje.org.anagram;

/**
 * @author Tushar
 *
 */
public class CheckAnagram {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		
		
		CheckAnagram.isAnagram("word", "wrdo");
        CheckAnagram.isAnagram("mary", "army");
        CheckAnagram.isAnagram("stop", "tops");
        CheckAnagram.isAnagram("boat", "btoa");
        CheckAnagram.isAnagram("pure", "in");
        CheckAnagram.isAnagram("fill", "fil");
        CheckAnagram.isAnagram("b", "bbb");
        CheckAnagram.isAnagram("ccc", "ccccccc");
        CheckAnagram.isAnagram("a", "a");
        CheckAnagram.isAnagram("sleep", "slep");

	}*/
	
	
	public static boolean isAnagram(String str1, String str2){  
       
        if(str1.length() != str2.length()){
            return false;
        }
        
        String string01 = str1.toLowerCase();
        String string02 = str2.toLowerCase();
       
        char[] charsForStr01 = string01.toCharArray();
       
        for(char ch1 : charsForStr01){
            int index = string02.indexOf(ch1);
            if(index != -1){
                string02 = string02.substring(0,index) + string02.substring(index +1, string02.length());
            }else{
                return false;
            }           
        }
       
        return string02.isEmpty();
    }

}
