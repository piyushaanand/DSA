class LRUCache {

    public class Node {
        int key, val;
        Node next;
        Node prev;

        public Node(int k, int v) {
            this.key = k;
            this.val = v;
            next = prev = null;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    HashMap<Integer, Node> map = new HashMap<>();

    int limit;

    public LRUCache(int capacity) {
        limit = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        Node node = map.get(key);
        remove(node); // remove from current position
        insertAtFront(node); // move to front
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node existing = map.get(key);
            existing.val = value;
            remove(existing);
            insertAtFront(existing);
        } else {
            if (map.size() == limit) {
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key, value);
            insertAtFront(newNode);
            map.put(key, newNode);
        }

    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */