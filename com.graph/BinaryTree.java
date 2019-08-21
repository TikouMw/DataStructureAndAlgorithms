public class BinaryTree{
    NodeTree root;

    public BinaryTree(NodeTree root){
        this.root = root;
    }

    public void AddNode(NodeTree NewNode){
        NodeTree explore = root;
        while(true){
            if(explore.value<NewNode.value){
                if(explore.right != null)
                    explore = explore.right;
                else{
                    explore.right = NewNode;
                    break;
                }
            }
            else{
                if(explore.left != null)
                    explore = explore.left;
                else{
                    explore.left = NewNode;
                    break;
                }
            }
        }
    }

    public void display(NodeTree root){
        display(root.right);
        display(root.left);
        System.out.println(root.value);
    }
}