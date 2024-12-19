package mitm310;

class Node {
    char value;    // The value of the node
    Node left;    // Left child
    Node right;   // Right child

    // Constructor to create a new node
    Node(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}