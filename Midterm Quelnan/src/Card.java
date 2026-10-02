public class Card {
    private int id;
    public Card(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Card " + id;
    }
}