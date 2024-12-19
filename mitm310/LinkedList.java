package mitm310;

import java.util.Scanner;

class LinkedList {

	static class Node {
		int info; // data of the node
		Node link; // link of next node

		Node(int item) {
			info = item;
			link = null;
		}
	}

	private Node start;

	public LinkedList() {
		start = null;
	}

	public void createList(int item) {
		Node newNode = new Node(item); // a new node with the given item

		if (start == null) { // the list is empty
			start = newNode;
		} else {
			Node save = start;
			Node ptr = start.link;

			while (ptr != null) {
				save = ptr;
				ptr = ptr.link;
			}

			save.link = newNode;// Linking the last node to the new node
		}
	}

	public void display() {
		Node current = start;
		while (current != null) {
			System.out.print(current.info + " -> ");
			current = current.link;
		}
		System.out.println("NULL");
	}

	public void traverseList() {
		Node ptr = start;
		System.out.println("Processing adding 5 with each value traversed in the list");
		while (ptr != null) {
			process(ptr.info);
			ptr = ptr.link;
		}
	}

	private void process(int info) {

		System.out.println("Adding 5 with the value:" + info + " : " + info + "+5=" + (info + 5));
	}

	public int countNodeList() {
		Node ptr = start;
		int num = 0;

		while (ptr != null) {
			num++;
			ptr = ptr.link;
		}
		return num;
	}

	public void searchunsortedList(int item) {
		Node ptr = start;
		int loc = -1;
		int node1 = 0;
		while (ptr != null) {
			if (ptr.info == item) {
				loc = 1;
				node1++;
				System.out.println("Item found: " + item + " at node: " + node1 + "\n");
				return;
			}
			node1++;
			ptr = ptr.link;
		}

		if (loc == -1) {
			System.out.println("Item not in the list.\n");
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.createList(1);
		list.createList(5);
		list.createList(10);
		list.createList(9);
		list.createList(12);
		list.createList(45);
		list.createList(6);
		list.createList(0);
		list.createList(3);

		System.out.println("Created list: ");
		list.display();

		Scanner sc = new Scanner(System.in);
		int function;
		do {
			System.out.print("Select function:\n1# Traverse:\n2# Search:\n3# Count\n4# End:\nGive Option:");
			function = sc.nextInt();
			if (function == 1) {
				list.traverseList();
				System.out.print("\n");
			} else if (function == 2) {
				System.out.println("Enter the value: ");
				int value = sc.nextInt();
				list.searchunsortedList(value);

			} else if (function == 3) {
				int count = list.countNodeList();
				System.out.println("Number of node in list: " + count);
				System.out.print("\n");
			} else if (function == 4) {
				System.out.println("Program Ending....");
			} else {
				System.out.println("Wrong Selection. Try Again");
			}
		} while (function != 4);
		sc.close();
	}
}
