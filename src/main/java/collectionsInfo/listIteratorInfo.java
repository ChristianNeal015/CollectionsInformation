package collectionsInfo;

public class listIteratorInfo {
         /* The list iterator interface also has a method to tell you the index of the current position.
     In fact, since Java iterators conceptually point between elements, it has two of them:
    The nextIndex method returns the integer index of the element that would be returned by the next call to next;
    the previousIndex method returns the index of the element that would be returned by the next call to previous.
    Of course, that is simply one less than nextIndex.
    These methods are efﬁcient—an iterator keeps a count of its current position.
    Finally, if you have an integer index n, then list.listIterator(n) returns an iterator that points just before the element with index n.
    That is, calling next yields the same element as list.get(n); obtaining that iterator is inefﬁcient.
    If you have a linked list with only a handful of elements, you don’t have to be overly paranoid about the cost of the get and set methods.
    But then, why use a linked list in the ﬁrst place? The only reason to use a linked list is to minimize the cost of insertion and removal in the middle of the list.
    If you have only a few elements, you can just use an ArrayList. We recommend that you simply stay away from all methods that use an integer index to denote a position in a linked list.
    If you want random access into a collection, use an array or ArrayList, not a linked list.
    The program in Listing 9.1 puts linked lists to work. It simply creates two lists, merges them, then removes every second element from the second list, and ﬁnally tests the removeAll method.
    We recommend that you trace the program ﬂow and pay special attention to the iterators.
    You may ﬁnd it helpful to draw diagrams of the iterator positions, like this:

     public static void main(String[] args)  {
      List<String> a = new LinkedList<>();
      a.add("Amy");
      a.add("Carl");
      a.add("Erica");
      List<String> b = new LinkedList<>();
      b.add("Bob");
      b.add("Doug");
      b.add("Frances");
      b.add("Gloria");
      // merge the words from b into a:
      ListIterator<String> aIter = a.listIterator();
      Iterator<String> bIter = b.iterator();
      while (bIter.hasNext())
      {

      ListIterator<E> listIterator() returns a list iterator for visiting the elements of the list.
    • ListIterator<E> listIterator(int index) returns a list iterator for visiting the elements of the list whose ﬁrst call to next will return the element with the given index.
    • void add(int i, E element) adds an element at the speciﬁed position.
    • void addAll(int i, Collection<? extends E> elements) adds all elements from a collection to the speciﬁed position.

*/
}


