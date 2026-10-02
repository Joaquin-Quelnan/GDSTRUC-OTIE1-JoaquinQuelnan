import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        CardStack deck = new CardStack(30);
        deck.push(new Card(1));
        deck.push(new Card(2));
        deck.push(new Card(3));
        deck.push(new Card(4));
        deck.push(new Card(5));
        deck.push(new Card(6));
        deck.push(new Card(7));
        deck.push(new Card(8));
        deck.push(new Card(9));
        deck.push(new Card(10));
        deck.push(new Card(11));
        deck.push(new Card(12));
        deck.push(new Card(13));
        deck.push(new Card(14));
        deck.push(new Card(15));
        deck.push(new Card(16));
        deck.push(new Card(17));
        deck.push(new Card(18));
        deck.push(new Card(19));
        deck.push(new Card(20));
        deck.push(new Card(21));
        deck.push(new Card(22));
        deck.push(new Card(23));
        deck.push(new Card(24));
        deck.push(new Card(25));
        deck.push(new Card(26));
        deck.push(new Card(27));
        deck.push(new Card(28));
        deck.push(new Card(29));
        deck.push(new Card(30));
        CardStack playerHand = new CardStack(30);
        CardStack discardPile = new CardStack(30);

        while (!deck.isEmpty()) {
            switch (random.nextInt(3)) {
                case 0:
                    playerHand.push(deck.pop());
                    break;

                case 1:
                    if (!playerHand.isEmpty()) {
                        discardPile.push(playerHand.pop());
                    }
                    break;

                case 2:
                    if (!playerHand.isEmpty()) {
                        playerHand.peek();
                    }
                    break;
            }

            System.out.println("\nCards in Hand:");
            playerHand.printStack();

            System.out.println("\nRemaining Cards:");
            deck.printStack();

            System.out.println("\nDiscarded Pile:");
            discardPile.printStack();

            if (!deck.isEmpty()) {
                System.out.print("\nPress Enter to Continue");
                scanner.nextLine();
            }
        }
    }
}