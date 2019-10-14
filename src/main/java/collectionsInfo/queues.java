package collectionsInfo;

public class queues {
    public static void main(String[] args) {
        // A queue interface speciﬁes that you can add elements at the tail end of the queue,
        // remove them at the head, and ﬁnd out how many elements are in the queue.
        // You use a queue when you need to collect objects and retrieve them in a “ﬁrst in, ﬁrst out” fashion
        // A minimal form of a queue interface might look like this:

//        public interface Queue<E> // a simplified form of the interface in the standard library
//         {
//         void add(E element);
//         E remove();
//         int size(); }
//        }

        // The interface tells you nothing about how the queue is implemented.
        // Of the two common implementations of a queue,
        // One uses a “circular array” and one uses a linked list

//          public class CircularArrayQueue<E> implements Queue<E> // not an actual library class
//    {
//          private int head;
//          private int tail;

//          CircularArrayQueue(int capacity) { . . . }
//          public void add(E element) { . . . }
//          public E remove() { . . . }
//          public int size() { . . . }
//          private E[] elements;
//   }

//   public class LinkedListQueue<E> implements Queue<E> // not an actual library class {
//   private Link head;
//   private Link tail;
//   LinkedListQueue() { . . . }   public void add(E element) { . . . }   public E remove() { . . . }   public int size() { . . . } }
    }
}
