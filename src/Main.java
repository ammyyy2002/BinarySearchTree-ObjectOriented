public class Main {
    public static void main(String[] args) {
        BinarySearchTree binaerBaum1 = new BinarySearchTree();
        double[] b1 = {50.0, 25.0, 75.0, 12.5, 87.5, 37.5, 62.5};
        for (double i: b1) {
            binaerBaum1.add(i);
        }

        BinarySearchTree binaerBaum2 = new BinarySearchTree();
        double[] b2 = {12.5, 25.0, 37.5, 50.0, 62.5, 75.0, 87.5};
        for (double i: b2) {
            binaerBaum2.add(i);
        }

        System.out.println("Binärbaum 1 hat Tiefe: " + binaerBaum1.getDepth());
        System.out.println("Binärbaum 2 hat Tiefe: " + binaerBaum2.getDepth());
    }
}