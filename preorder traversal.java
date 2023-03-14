class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        preo(root,a);

        
       
        return a;
    }
    public static void preo(Node root,ArrayList<Integer> a){
        if(root==null) return;
        a.add(root.data);
        preo(root.left,a);
        preo(root.right,a);
    }

}
