class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null)
        return 0;
        int r = height(node.left);
        int l = height(node.right);
        int h = Math.max(r,l)+1;
        return h;
    }
}
