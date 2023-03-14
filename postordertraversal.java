/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
            ArrayList<Integer> a = new ArrayList<Integer>();
        postorder(root,a);

        
       
        return a;
    }
    public static void postorder(Node root,ArrayList<Integer> a){
        if(root==null) return;
        postorder(root.left,a);
        postorder(root.right,a);
        a.add(root.data);
    }
}
