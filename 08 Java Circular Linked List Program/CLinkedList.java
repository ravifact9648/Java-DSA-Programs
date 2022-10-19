// Java Program to Delete a 
// Node From the Middle of the
// Circular Linked List

class CLinkedList {

	class Node {
		int data;
		Node next;
	}
	private static int size;

	// head points first node and
	// tail points to last node
	private Node head, tail;
	CLinkedList()
	{
		this.head = null;
		this.tail = null;
		size = 0;
	}
	public void addNode(int d)
	{
		// create a empty node
		Node n = new Node();

		// list is empty
		if (this.head == null) {
			n.data = d;
			this.head = n;
			this.tail = n;
			n.next = this.head;
		}

		// list has one node or more than one nodes
		else {
			n.data = d;
			tail.next = n;
			tail = n;
			tail.next = head;
		}
		size++;
	}
	public void deleteNodeMiddle()
	{
		int loc;
		Node temp, prev;

		// calculating position of middle node
		if (size % 2 == 0) {
			loc = size / 2;
		}
		else {
			loc = (size / 2) + 1;
		}

		// list is empty
		if (head == null) {
			return;
		}

		// list contains only one node
		else if (head == tail) {
			head = null;
			tail = null;
		}

		// list contains only two nodes
		else if (loc == 1) {
			head = tail;
			tail.next = tail;
		}

		// list contains more than two nodes
		else {
			temp = head;
			prev = null;
			int i = 1;
			while (i < loc) {
				prev = temp;
				temp = temp.next;
				i++;
			}
			prev.next = temp.next;
			temp = null;
		}

		size--;
		if (size < 0) {
			size = 0;
		}
	}
	public void display()
	{
		// displaying list
		if (head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
			System.out.println();
		}
	}
}
class Test {
	public static void main(String args[])
	{
		CLinkedList c1 = new CLinkedList();

		// adding node in linkedlist
		c1.addNode(10);
		c1.addNode(20);
		c1.addNode(30);
		c1.addNode(40);

		// displaying nodes after adding
		System.out.print("List=");
		c1.display();

		// delete node in middle
		c1.deleteNodeMiddle();

		// displaying linkedlist after deleting middle node
		System.out.print(
			"List after deleting middle node=");
		c1.display();

		c1.deleteNodeMiddle();

		// displaying linkedlist after deleting middle node
		System.out.print(
			"List after deleting middle node=");
		c1.display();

		c1.deleteNodeMiddle();

		// displaying linkedlist after deleting middle node
		System.out.print(
			"List after deleting middle node=");
		c1.display();

		c1.deleteNodeMiddle();

		// displaying linkedlist after deleting middle node
		System.out.print(
			"List after deleting middle node=");
		c1.display();
	}
}
