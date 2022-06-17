package node;

public class LeafNode implements Node{
    private final int value;

    public LeafNode(int value){
        this.value = value;
    }

    @Override
    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "(" + this.getValue() + ")";
    }
}
