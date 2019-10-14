package collectionsInfo;

public class listInfo {
   /* Perhaps you once took a data structures course in which you learned how to implement linked lists.
    You may have bad memories of tangling up the links when removing or adding elements in the linked list.
    If so, you will be pleased to learn that the Java collections library supplies a class LinkedList ready for you to use.
    The following code example adds three elements and then removes the second one:
    List<String> staff = new LinkedList<>(); // LinkedList implements List
    staff.add("Amy");
    staff.add("Bob");
    staff.add("Carl");
    Iterator iter = staff.iterator();
    String first = iter.next(); // visit first element
    String second = iter.next(); // visit second element
    iter.remove(); // remove last visited element

    There is, however, an important difference between linked lists and generic collections.
    A linked list is an ordered collection in which the position of the objects matters.
    The LinkedList.add method adds the object to the end of the list.
    But you will often want to add objects somewhere in the middle of a list.
    This positiondependent add method is the responsibility of an iterator, since iterators describe positions in collections.
    Using iterators to add elements makes sense only for collections that have a natural ordering.
    For example, the set data type that we discuss in the next section does not impose any ordering on its elements.
    Therefore, there is no add method in the Iterator interface. I
    nstead, the collections library supplies a subinterface ListIterator that contains an add method:

    */
    }

