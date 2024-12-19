package mitm310;

import java.util.Scanner;

public class  Queue {
	public static int maxSize=6;
	public static int[] queueArray=new int[maxSize];  
    public static int front=-1;         
    public static int rear=-1;          

    public static void insert(int item) {
        if (rear == maxSize - 1) {// the queue is full
            System.out.println("Overflow: Queue is full. Cannot insert item.");
            return;
        }

        if (front == -1) { // the queue is empty
            front = 0;
        }

        rear = rear + 1;
        queueArray[rear] = item; 
        System.out.println("Item " + item + " inserted into queue.");
        System.out.println("Present item: ");
        display();
    }

    public static void delete() {
        if (front == -1 || front > rear) { // the queue is empty
            System.out.println("Underflow: Queue is empty. Cannot delete item.\n");
            return;
        }

        int item = queueArray[front]; 
        System.out.println("Item " + item + " deleted from queue.");
        
        front = front + 1;
        System.out.println("Present item: ");
        display();
    }

    // Method to display the queue's current state (for verification)
    public static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.\n");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int function;
    	do {
    		System.out.print("Select function:\n1# Insert in Queue:\n2# Delete from Queue:\n3# Exit:\nGive Option:");
			function = sc.nextInt();
			if(function==1) {
				System.out.println("Enter the value: ");
				int item=sc.nextInt();
				insert(item);
			}
			else if(function==2) {
				delete();
			}
			else if (function == 3) {
				System.out.println("Program Ending....");
			} else {
				System.out.println("Wrong Selection. Try Again");
			}
    	}while(function!=3);
    	sc.close();
    }
}
