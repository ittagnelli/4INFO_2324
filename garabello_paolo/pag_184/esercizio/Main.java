public class Main {
    public static void main(String[] args) {
        MyHashTable table = new MyHashTable();
    
        table.add(new Studente("gianni", 0));
        table.add(new Studente("luca", 11));
        table.add(new Studente("antonio", 20));
        table.add(new Studente("giacomo", 30));
        table.add(new Studente("giovanni", 33));
        table.add(new Studente("marco", 44));
        table.add(new Studente("piero", 55));
        table.add(new Studente("andrea", 66));
        table.add(new Studente("ludovico", 77));
        System.out.println(table);

        System.out.println(table.search(0));
    }
}
