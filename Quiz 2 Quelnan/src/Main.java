public class Main {
    public static void main(String[] args) {
        PlayerLinkedList playerList = new PlayerLinkedList();
        playerList.add(new Player(1, "Goku", 500));
        playerList.add(new Player(2, "Saitama", 999));
        playerList.add(new Player(3, "Sakamoto", 10));

        playerList.remove();
        System.out.print(playerList.size());
        System.out.println(playerList.contains(new Player(1, "Goku", 500)));
        System.out.println(playerList.indexOf(new Player(1, "Goku", 500)));

        playerList.printList();
    }
}