
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

/**
 * ONLY tests the method isSorted() of the LinkedIntList class 
 * @author Nora P.
 * @version 6/13/20
 */
class JTestIsSorted {

	@Test
	void testisSorted() {
		LinkedIntList testl = new LinkedIntList();
		testl.add(18);
		testl.add(27);
		testl.add(93);
		testl.add(212);
		boolean sorted = testl.isSorted();
		
		assertTrue(sorted);
		
		
		
	}
	
	@Test
	void testIsEmpty() {
		LinkedIntList testl = new LinkedIntList();
		boolean sorted = testl.isSorted();
		
		assertTrue(sorted);	
		
	}
	
	@Test
	void testNotSorted() {
		LinkedIntList testl = new LinkedIntList();
		testl.add(18);
		testl.add(27);
		testl.add(93);
		testl.add(212);
		boolean sorted = testl.isSorted();
		assertTrue(sorted);
		testl.set(0, 35);
		sorted = testl.isSorted();
		assertFalse(sorted);	
	}	

}
