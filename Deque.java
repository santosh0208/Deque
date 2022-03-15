public class Deque<Item> implements Iterable<Item> {
    private Node first,last;
    int n;
    private class Node{
        Item data;
        Node next;
    }
    // construct an empty deque
    public Deque()
    {
        first=null;
        last=null;
        n=0;
    }


    // is the deque empty?
    public boolean isEmpty(){
        if (first==null && last==null){
            return true;
        }
        return false;

    }

    // return the number of items on the deque
    public int size(){
        return n;
    }

    // add the item to the front
    public void addFirst(Item item){
        if (item==null)throw new IllegalArgumentException();
        Node oldfirst=first;
        first=new Node();
        first.data=item;
        first.next=oldfirst;
        n=n+1;
    }

    // add the item to the back
    public void addLast(Item item)

    // remove and return the item from the front
    public Item removeFirst()

    // remove and return the item from the back
    public Item removeLast()

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()

    // unit testing (required)
    public static void main(String[] args)

}

