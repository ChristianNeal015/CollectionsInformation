package collectionsInfo;

public class sortedSetInfo {
    /*
    The TreeSet class is similar to the hash set, with one added improvement.
    A tree set is a sorted collection.You insert elements into the collection in any order.
    When you iterate through the collection, the values are automatically presented in sorted order.
    For example, suppose you insert three strings and then visit all elements that you added.

    SortedSet<String> sorter = new TreeSet<>(); // TreeSet implements SortedSet
    sorter.add("Bob");
    sorter.add("Amy");
    sorter.add("Carl");
    for (String s : sorter) System.println(s);

    Then, the values are printed in sorted order: Amy Bob Carl.
    As the name of the class suggests, the sorting is accomplished by a tree data structure.
    (The current implementation uses a red-black tree. For a detailed description of red-black trees see, for example,
    Introduction to Algorithms by Thomas Cormen, Charles Leiserson, Ronald Rivest, and Clifford Stein, The MIT Press, 2009.)
    Every time an element is added to a tree, it is placed into its proper sorting position.
    Therefore, the iterator always visits the elements in sorted order.
    Adding an element to a tree is slower than adding it to a hash table—see Table 9.3 for a comparison.
    But it is still much faster than checking for duplicates in an array or linked list.
    If the tree contains n elements, then an average of log2n comparisons are required to ﬁnd the correct position for the new element.
    For example, if the tree already contains 1,000 elements, adding a new element requires about 10 comparisons.

    public class TreeSetTest 11  {

    public static void main(String[] args) 13     {
   SortedSet<Item> parts = new TreeSet<>();
      parts.add(new Item("Toaster", 1234));
      parts.add(new Item("Widget", 4562));
      parts.add(new Item("Modem", 9912));
    System.out.println(parts);

    NavigableSet<Item> sortByDescription = new TreeSet<>(
     Comparator.comparing(Item::getDescription));
         sortByDescription.addAll(parts);
         System.out.println(sortByDescription);
       }

     */
}
