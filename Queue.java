import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Москва");
        queue.offer("Питер");
        queue.offer("Самара");
        queue.offer("Казань");

        System.out.println(queue.peek());

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
}
