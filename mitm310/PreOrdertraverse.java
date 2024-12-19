package mitm310;
import java.util.Stack;

public class PreOrdertraverse {
    

    public static void preorderTraversal(Node root) {
        if (root == null) return;
        
        
        Stack<Node> stack = new Stack<>(); // Stack to store nodes
        
        stack.push(root); // Push the root node to the stack
        
        while (!stack.isEmpty()) {
           
            Node ptr = stack.pop();  // Pop the top element from the stack
            
            System.out.print(ptr.value + " ");
            
           
            if (ptr.right != null) {
                stack.push(ptr.right);  // Push right child to stack if it exists
            }
            
            
            if (ptr.left != null) {
                stack.push(ptr.left); // Push left child to stack if it exists
            }
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
        root.right.left.left=new Node('I');
        root.right.left.right=new Node('J');
        
        System.out.println("Pre-order traversal:");
        preorderTraversal(root);
    }
}
//public class PreOrdertraverse {
//    
//    // Pre-order traversal using sequential representation (array-based) without recursion
//    public static void preorderTraversalWithoutRecursion(int[] tree) {
//        if (tree == null || tree.length == 0) return;
//        
//        // Stack to store the indices of nodes
//        Stack<Integer> stack = new Stack<>();
//        
//        // Start with the root node (index 0)
//        stack.push(0);
//        
//        while (!stack.isEmpty()) {
//            // Pop the top element (current node index)
//            int index = stack.pop();
//            
//            // Process the current node (print its value)
//            System.out.print(tree[index] + " ");
//            
//            // Push the right child to stack if it exists
//            int rightChildIndex = 2 * index + 2;
//            if (rightChildIndex < tree.length) {
//                stack.push(rightChildIndex);
//            }
//            
//            // Push the left child to stack if it exists
//            int leftChildIndex = 2 * index + 1;
//            if (leftChildIndex < tree.length) {
//                stack.push(leftChildIndex);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        // Sequential (array) representation of the binary tree
//        // Representing the tree: 
//        //          1
//        //         / \
//        //        2   3
//        //       / \ / \
//        //      4  5 6  7
//        int[] tree = {1, 2, 3, 4, 5, 6, 7};
//        
//        System.out.println("Pre-order traversal (without recursion, using sequential representation):");
//        preorderTraversalWithoutRecursion(tree);  // Start traversal from the root (index 0)
//    }
//}
