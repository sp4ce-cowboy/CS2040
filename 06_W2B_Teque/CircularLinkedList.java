class CircularLinkedList {

    public int size = 0; 
    public ListNode head = null; 
    public ListNode tail = null;

    public void addFirst(int element) {
        ListNode newNode = new ListNode(element, null);  
        if(head != null) {
            newNode.setNext(head);
            tail.setNext(newNode);
            head = newNode;
        } else {
            head = newNode;
            tail = head;
            head.setNext(head);
        }
        size++;
    }

    public void addLast(int element) {
        ListNode newNode = new ListNode(element, null);
        if(head != null) {
            newNode.setNext(head);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            addFirst(element);
        }
        size++;
    }

    public void addMiddle(int element) {
        if(head == null || tail == null) {
            addFirst(element);
            return;
        }

        int midIndex = (size + 1) / 2;

        ListNode newNode = new ListNode(element, null);
        ListNode current = head;
        for(int i = 0; i < midIndex - 1; i++) {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;

    }

    public int get(int index) {
        ListNode current = head;
        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }
}
