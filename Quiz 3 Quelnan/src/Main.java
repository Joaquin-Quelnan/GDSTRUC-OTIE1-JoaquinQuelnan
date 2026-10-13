import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(8);
        queue.enqueue(new Player(1, "Goku", 500));
        queue.enqueue(new Player(2, "Saitama", 999));
        queue.enqueue(new Player(3, "Deku", 100));
        queue.enqueue(new Player(4, "Superman", 5000));
        queue.enqueue(new Player(5, "KSI", 1));
        queue.enqueue(new Player(6, "Kazuya (Rent a Girlfriend)", 2));
        queue.enqueue(new Player(7, "Lil' Timmy", 99999));

        queue.printQueue();

        int games = 0;

        while (true) {
            Player p = null;
            switch (random.nextInt(7) + 1) {
                case 1:
                    p = new Player(1, "Goku", 500);
                    break;

                case 2:
                    p = new Player(2, "Saitama", 999);
                    break;

                case 3:
                    p = new Player(3, "Deku", 100);
                    break;

                case 4:
                    p = new Player(4, "Superman", 5000);
                    break;

                case 5:
                    p = new Player(5, "KSI", 1);
                    break;

                case 6:
                    p = new Player(6, "Kazuya (Rent a Girlfriend)", 2);
                    break;

                case 7:
                    p = new Player(7, "Lil' Timmy", 99999);
                    break;
            }

            queue.enqueue(p);
            queue.printQueue();

            if (queue.size() >= 5) {
                games++;
                System.out.println("\nMatch Found! Game Start:");
                System.out.println("1. " + queue.dequeue());
                System.out.println("2. " + queue.dequeue());
                System.out.println("3. " + queue.dequeue());
                System.out.println("4. " + queue.dequeue());
                System.out.println("5. " + queue.dequeue());
            }

            if (games >= 10){
                break;
            }

            System.out.println("\nPress Enter to Continue");
            scanner.nextLine();
        }
    }
}