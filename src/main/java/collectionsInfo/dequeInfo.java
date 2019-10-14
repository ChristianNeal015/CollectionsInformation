package collectionsInfo;

public class dequeInfo {
    /*
    As we already discussed, a queue lets you efﬁciently add elements at the tail and remove elements from the head.
    A double-ended queue, or deque, lets you efﬁciently add or remove elements at the head and tail.
    Adding elements in the middle is not supported. Java SE 6 introduced a Deque interface.
    It is implemented by the ArrayDeque and LinkedList classes, both of which provide deques whose size grows as needed.
    In Chapter 14, you will see bounded queues and deques.

    Example:
    java.util.Deque<E>
    • void addFirst(E element)
    • void addLast(E element)
    • boolean offerFirst(E element)
    • boolean offerLast(E element)

    // Adds the given element to the head or tail of this deque.
    If the queue is full, the ﬁrst two methods throw an IllegalStateException, whereas the last two methods return false.

    Continuing:
    java.util.Deque<E>
    • E removeFirst()
    • E removeLast()
    • E pollFirst()
    • E pollLast()
    removes and returns the element at the head of this queue, provided the queue is not empty.
    If the queue is empty, the ﬁrst two methods throw a NoSuchElementException, whereas the last two methods return null.
    • E getFirst()
    • E getLast()
    • E peekFirst()
    • E peekLast()
    returns the element at the head of this queue without removing it, provided the queue is not empty.
    If the queue is empty, the ﬁrst two methods throw a NoSuchElementException, whereas the last two methods return null.

    Example ArrayDeque:
    java.util.ArrayDeque<E>
    • ArrayDeque()
    • ArrayDeque(int initialCapacity)
    constructs an unbounded deque with an initial capacity of 16
    or the given initial capacity.


     */
}
