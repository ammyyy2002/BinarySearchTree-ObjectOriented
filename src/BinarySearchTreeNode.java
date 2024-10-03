public class BinarySearchTreeNode {
    private BinarySearchTreeNode linkesKind;
    private BinarySearchTreeNode rechtesKind;
    private Double wert;

    public BinarySearchTreeNode(){}

    public void add(double wert){
        if (this.wert == null){
            this.wert = wert;
        }
        else if (0.000001 < Math.abs(this.wert - wert)) {
            if (this.wert > wert) {
                if (linkesKind == null) {
                    linkesKind = new BinarySearchTreeNode();
                }
                linkesKind.add(wert);
            }
            else if (this.wert < wert) {
                if (rechtesKind == null) {
                    rechtesKind = new BinarySearchTreeNode();
                }
                rechtesKind.add(wert);
            }
        }
    }

    public int getDepth(){
        int linkeTiefe;
        int rechteTiefe;
        if (linkesKind == null && rechtesKind == null){
            return 1;
        } else {
            if (linkesKind != null){
                linkeTiefe = linkesKind.getDepth();
            } else {
                linkeTiefe = 0;
            }
            if (rechtesKind != null){
                rechteTiefe = rechtesKind.getDepth();
            } else {
                rechteTiefe = 0;
            }
            if (linkeTiefe < rechteTiefe){
                return (rechteTiefe + 1);
            } else {
                return (linkeTiefe + 1);
            }

        }
    }
}
