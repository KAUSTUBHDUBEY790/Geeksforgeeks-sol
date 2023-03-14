class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> a = new ArrayList<Integer>();
        inorder(root,a);
        return a;
    }
    public static void inorder(Node root,ArrayList<Integer> a){
        if(root== null) return;
        inorder(root.left,a);
        a.add(root.data);
        inorder(root.right,a);
    }
}
