package mitm310;

import java.util.Stack;

public class PostOrderTraverse {
	public static void postorderTraversal(Node root) {
		if (root == null)
			return;

		Stack<Node> stack1 = new Stack<>(); // Stack to store nodes
		Stack<Node> stack2 = new Stack<>(); // second Stack to store nodes

		stack1.push(root); // Push the root node to the stack
		while (!stack1.isEmpty()) {
			Node ptr = stack1.pop();
			//System.out.println("Popped from stack1: " + ptr.value);
			stack2.push(ptr);
			//System.out.println("Pushed into Stack2: " + ptr.value);

			if (ptr.left != null) {
				stack1.push(ptr.left);
				//System.out.println("Pushed into Stack1: " + ptr.value);
			}

			if (ptr.right != null) {
				stack1.push(ptr.right);
				//System.out.println("Pushed into Stack1: " + ptr.value);
			}
		}
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop().value + " ");
		}
	}

	public static void main(String[] args) {
		// My Binary tree
		Node root = new Node('A');
		root.left = new Node('B');
		root.right = new Node('C');
		root.left.left = new Node('D');
		root.left.right = new Node('E');
		root.right.left = new Node('F');
		root.right.right = new Node('G');
		root.left.left.right = new Node('H');
		root.right.left.left = new Node('I');
		root.right.left.right = new Node('J');

		System.out.println("Post-order traversal:");
		postorderTraversal(root);
	}
}
