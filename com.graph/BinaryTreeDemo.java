public class BinaryTreeDemo{

    public static void main(String[] args){
       BinaryTree tree = new BinaryTree(new NodeTree(10, null, null));
       tree.AddNode(new NodeTree(5, null, null));
       tree.AddNode(new NodeTree(15, null, null));
       tree.AddNode(new NodeTree(50, null, null));
       tree.AddNode(new NodeTree(3, null, null));
    }

}