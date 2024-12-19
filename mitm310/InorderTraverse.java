package mitm310;
import java.util.Stack;

public class InorderTraverse {
    
    public static void inorderTraversalWithoutRecursion(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        
        // Pointer to traverse the tree
        Node ptr = root;
        
        while (ptr != null || !stack.isEmpty()) {
            
            while (ptr != null) {
                stack.push(ptr);
                ptr = ptr.left;  // Move to the left child
            }
            
            ptr = stack.pop();
            System.out.print(ptr.value + " ");  // Process the node 
            ptr = ptr.right;
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
        
        System.out.println("In-order traversal:  ");
        inorderTraversalWithoutRecursion(root);  // Start traversal from the root
    }
}
//public class InorderTraverse {
//    
//    // In-order traversal using sequential representation (array-based) without recursion
//	public static void inorderTraversalWithoutRecursion(int[] tree) {
//        if (tree == null || tree.length == 0) return;
//        
//        // Stack to store the indices of nodes
//        Stack<Integer> stack = new Stack<>();
//        
//        // Pointer to traverse the tree
//        int index = 0;  // Start from the root node
//        
//        // Step 2: Traverse the leftmost path, pushing nodes to the stack
//        while (index != -1 || !stack.isEmpty()) {
//            
//            // (a) Traverse to the left child and push the nodes onto the stack
//            while (index != -1 && index < tree.length) { // Prevent index out of bounds
//                stack.push(index);
//                index = 2 * index + 1;  // Move to the left child (2*i + 1)
//            }
//            
//            // (b) Pop from the stack and process the current node
//            if (!stack.isEmpty()) {
//                index = stack.pop();
//                System.out.print(tree[index] + " ");
//                
//                // (c) Now, move to the right child
//                index = 2 * index + 2;  // Move to the right child (2*i + 2)
//
//                // If the right child index exceeds the array length, set index to -1 to prevent out-of-bounds access
//                if (index >= tree.length) {
//                    index = -1;
//                }
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
//        int[] tree = {1, 2, 3, 4, 5, 6, 7,};
//        
//        System.out.println("In-order traversal (without recursion, using sequential representation):");
//        inorderTraversalWithoutRecursion(tree);  // Start traversal from the root (index 0)
//    }
//}