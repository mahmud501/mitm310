package mitm310;

import java.util.Scanner;

public class Stack {  
    public static int top=-1;           
    public static int maxSTK=6; 
    public static int[] stackArray=new int[maxSTK];
    
    public static void push(int item) {
        if (top == maxSTK - 1) {
         
            System.out.println("Overflow: Stack is full. Cannot add item.");
            return;
        }

        top = top + 1;    
        stackArray[top] = item;  
        System.out.println("Item " + item + " pushed to stack.");
        System.out.println("Present item: ");
        display();
    }
    public static void pop() {
        if (top == -1) {// the stack is empty
            System.out.println("Underflow: Stack is empty. Cannot pop item.");
            return;
        }

        int item = stackArray[top]; 
        top = top - 1; 
        System.out.println("Item " + item + " popped from stack.");
        System.out.println("Present item: ");
        display();
    }
    
    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int function;
    	do {
    		System.out.print("Select function:\n1# PUSH:\n2# POP:\n3# Exit:\nGive Option:");
			function = sc.nextInt();
			if(function==1) {
				System.out.println("Enter the value: ");
				int item=sc.nextInt();
				push(item);
			}
			else if(function==2) {
				pop();
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