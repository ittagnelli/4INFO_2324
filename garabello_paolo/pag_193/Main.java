public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        
        System.out.println(queue.isFull());

        queue.enqueue("Anto");
        queue.enqueue("Gianni");
        queue.enqueue("Giacomo");
        queue.enqueue("Piero");
        System.out.println(queue.isEmpty());     
        System.out.println(queue);

        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.last());
        System.out.println(queue);
        
        queue.clear();
        System.out.println(queue);
    }
}
