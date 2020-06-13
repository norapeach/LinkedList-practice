/**
 * IsSortedChecker.java
 */

/***************************************************************************
 * METHOD START LINE 78 BJP5 Exercise 16.3: Method isSorted 
 * 
 * REQUIREMENTS
 * - This method has been added to the LinkedIntList class defined in Ch6
 * http://www.buildingjavaprograms.com/code-files/5ed/ch16/LinkedInt.java
 **************************************************************************/
/**
 * This program tests the isSorted method on a list to determine if the list is
 * sorted (nondecreasing order). This implementation considers an empty list as
 * sorted.
 * 
 * @author Nora P.
 * @version 06/12/20
 */
public class IsSortedChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        LinkedIntList list1 = new LinkedIntList();
        list1.add(18);
        list1.add(27);
        list1.add(93);
        list1.add(212);
        
        System.out.println("Method isSorted Test:");
        System.out.println("Original list sequence" + list1);
        System.out.println("isSorted >>> " + list1.isSorted());
        System.out.println();
        
        list1.add(12);
        list1.add(2);
        list1.set(1, 3);
        
        System.out.println("The List has been modified >>> " + list1);
        System.out.println("isSorted >>> " + list1.isSorted());
	}

}
