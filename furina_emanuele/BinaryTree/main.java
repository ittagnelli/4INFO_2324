public class main{
    public static void main(String[] args) {
        BinaryTree bT= new BinaryTree();
        bT.addNode(20);
        bT.addNode(9);
        bT.addNode(7);
        bT.addNode(50);
        bT.addNode(11);
        bT.BFSVisit();
        int value = 50;
        boolean trovato = bT.BtsSearch(bT.root, value);

        if (trovato) {
            System.out.println("si");
        }
        else
        {
            System.out.println("No");
        }
    }
} 
