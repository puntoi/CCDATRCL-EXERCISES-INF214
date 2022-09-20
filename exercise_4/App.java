import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> QueueName = new LinkedList<>();

        // Adds elements to the queue
        QueueName.add("Tristan Tenerife");
        QueueName.add("Winna Jane Bablis");
        QueueName.add("Richael Paller");
        QueueName.add("Luis Miguel Verzosa");
        QueueName.add("Marianne Jovi Papina");

        // Display all elements of the queue.
        System.out.println(QueueName);

        // Removes the element at the front of the queue
        QueueName.remove(QueueName);

        // Returns the number of elements in the queue.
        System.out.println(QueueName.size());

        // Shows the element at the front of the queue
        System.out.println(QueueName.peek());

        // Display all elements of the queue.
        System.out.println(QueueName);

        Queue<String> QueueNames = new LinkedList<>();

        // Adds elements to the queue
        QueueNames.add("Jamil Valencia");
        QueueNames.add("james Francis Jalalon");
        QueueNames.add("Jethro Ruiz Vargas");
        QueueNames.add("Neil Rifarial");
        QueueNames.add("Vincent Paul Saavedra");

        // Display all elements of the queue.
        System.out.println(QueueNames);

        // Removes the element at the front of the queue
        QueueNames.remove(QueueNames);

        // Returns the number of elements in the queue.
        System.out.println(QueueNames.size());

        // Shows the element at the front of the queue
        System.out.println(QueueNames.peek());

        // Display all elements of the queue.
        System.out.println(QueueNames);
    }
}
