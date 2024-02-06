public class Main {
    public static void main(String[] args) {
        HashLinkedList hashList = new HashLinkedList();

        hashList.hash(new Studente(0, "Massimo"));
        hashList.hash(new Studente(1, "Gianni"));
        hashList.hash(new Studente(11, "Giacomo"));
        hashList.hash(new Studente("Franco"));
        hashList.hash(new Studente("Luca"));
        hashList.hash(new Studente("Giorgio"));

        System.out.println(hashList);


        System.out.println("id 1: " + hashList.search(1));
        System.out.println("id 11: " + hashList.search(11));
    }
}