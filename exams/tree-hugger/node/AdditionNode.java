package node;

public class AdditionNode implements Node{
    
    private Node left;
    private Node right;

    public AdditionNode(Node left, Node right){
        if(null == left || null == right || right == left){
            throw new IllegalArgumentException("Null argument or same argument twice!");
        }
        this.left  = left;
        this.right = right;
    }

    @Override
    public int getValue() {
        return left.getValue() + right.getValue(); //inorder
    }

    @Override
    public String toString() {
        return "(" + left + " + " + right + ")";
    }
}
