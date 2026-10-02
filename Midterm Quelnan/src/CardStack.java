import java.util.EmptyStackException;

public class CardStack {
    private Card[] stack;
    private int top;

    public CardStack(int capacity) {
        stack = new Card[capacity];
        top = -1;
    }

    public void push(Card card) {
        if (top == stack.length - 1) {
            Card[] newStack = new Card[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[++top] = card;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Card poppedCard = stack[top];
        stack[top] = null;
        top--;
        return poppedCard;
    }

    public Card peek() {
        if (isEmpty())
            throw new EmptyStackException();

        return stack[top];
    }

    public void push(CardStack draw) {
        int amount = new java.util.Random().nextInt(5) + 1;

        while (amount-- > 0 && !draw.isEmpty()) {
            push(draw.pop());
        }
    }

    public void pop(CardStack discardPile) {
        int amount = new java.util.Random().nextInt(5) + 1;

        while (amount-- > 0 && !this.isEmpty()) {
            discardPile.push(this.pop());
        }
    }

    public void printStack() {

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
