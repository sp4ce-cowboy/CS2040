/*
 * ListNode class is taken from materials
 * provided with lecture 5 on List ADT.
 */
class ListNode {
    /* attributes */
    public int value;
    public ListNode next;

    /* constructors */
    public ListNode(int val) { 
        this(val, null);
    }

    public ListNode(int val, ListNode n) { 
        this.value = val; 
        this.next = n; 
    }

    /* get the next ListNode */
    public ListNode getNext() { 
        return next;
    }

    /* get the item of the ListNode */
    public int getValue() {
        return value;
    }

    /* set the item of the ListNode */
    public void setValue(int val) {
        value = val;
    }

    /* set the next reference */
    public void setNext(ListNode n) {
        next = n;
    }


}
