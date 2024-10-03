public class BinarySearchTree {

    BinarySearchTreeNode wurzel;

    public BinarySearchTree(){}

    public void add(double wert){
        if (this.wurzel == null){
            this.wurzel = new BinarySearchTreeNode();
            this.wurzel.add(wert);
        }
        else {
            wurzel.add(wert);
        }
    }

    public int getDepth() {
        if (wurzel == null) {
            return 0;
        } else {
            return wurzel.getDepth();
        }
    }
}

