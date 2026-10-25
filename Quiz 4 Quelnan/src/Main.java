public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(25, "Pikachu", 10);
        Player celebi = new Player(25, "Celebi", 10);
        Player hitmochan = new Player(25, "Hitmochan", 10);
        Player mankey = new Player(25, "Mankey", 10);
        Player starmie = new Player(25, "Starmie", 10);
        Player togepi = new Player(25, "Togepi", 10);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(hitmochan.getUserName(), hitmochan);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(starmie.getUserName(), starmie);
        hashtable.put(togepi.getUserName(), togepi);

        hashtable.remove(togepi.getUserName(), togepi);
        hashtable.remove(starmie.getUserName(), starmie);
        hashtable.remove(mankey.getUserName(), mankey);

        System.out.println("\n");

        hashtable.printHashtable();
    }
}