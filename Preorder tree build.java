public class Main
{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right = null;
            this.left = null;
        }
    }
    static class BineryTree{
        static int i = -1;
        public static Node buildtree(int node[]){
            i++;
            if(node[i]==-1)
            return null;
            
            Node newnode = new Node(node[i]);
            newnode.left = buildtree(node);
            newnode.right = buildtree(node);
            
            return newnode;
        }
    }
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,7,-1,-1};
		BineryTree tree= new BineryTree();
		Node root = tree.buildtree(nodes);
		System.out.println(root.data);
	}
}
