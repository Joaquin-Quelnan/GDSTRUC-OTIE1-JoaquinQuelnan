public class PlayerLinkedList {
    private PlayerNode head;

    public void add(Player player) {
        PlayerNode node = new PlayerNode(player);
        node.setNextPlayer(head);
        head = node;
    }

    public Player remove() {
        if (head == null) {
            return null;
        }
        Player removedPlayer = head.getPlayer();
        head = head.getNextPlayer();
        return removedPlayer;
    }

    public int size() {
        PlayerNode current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.getNextPlayer();
        }
        return count;
    }

    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayer();
            index = index + 1;
        }
        return -1;
    }

    public void printList() {
        PlayerNode currentNode = head;

        System.out.println("HEAD ");

        while (currentNode != null) {
            System.out.print(" -> " + currentNode.getPlayer());
            currentNode = currentNode.getNextPlayer();
        }
    }
}