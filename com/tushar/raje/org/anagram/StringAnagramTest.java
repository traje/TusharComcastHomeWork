package com.tushar.raje.org.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringAnagramTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
    public void testIsAnagram() {
        assertTrue(CheckAnagram.isAnagram("word", "wrdo"));
        assertTrue(CheckAnagram.isAnagram("mary", "army"));
        assertTrue(CheckAnagram.isAnagram("stop", "tops"));
        assertTrue(CheckAnagram.isAnagram("boat", "btoa"));
        assertFalse(CheckAnagram.isAnagram("pure", "in"));
        assertFalse(CheckAnagram.isAnagram("fill", "fil"));
        assertFalse(CheckAnagram.isAnagram("b", "bbb"));
        assertFalse(CheckAnagram.isAnagram("ccc", "ccccccc"));
        assertTrue(CheckAnagram.isAnagram("a", "a"));
        assertFalse(CheckAnagram.isAnagram("sleep", "slep"));
       
    }

}
