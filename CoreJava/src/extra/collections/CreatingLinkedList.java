package extra.collections;

/* The behaviour of LinkedList is exactly same as a List.
 * The elements store inside the LinkedList will be in the form of node.
 * Node contain the two important part: 
 * value and address of the next Node
 * */

import java.util.LinkedList;

public class CreatingLinkedList {
	public static void main(String[] args) {
		LinkedList linkList = new LinkedList();
		
		linkList.add(342);
		linkList.add("Hello");
		linkList.add(false);
		linkList.add('Z');
		linkList.add(342.1474);
		linkList.add(true);
		
		System.out.println("linkList: ");
		System.out.println(linkList);
	}
}
