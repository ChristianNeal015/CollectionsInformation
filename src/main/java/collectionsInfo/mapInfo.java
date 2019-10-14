package collectionsInfo;

public class mapInfo {
    /*
    A set is a collection that lets you quickly ﬁnd an existing element.
    However, to look up an element, you need to have an exact copy of the element to ﬁnd.
    That isn’t a very common lookup—usually, you have some key information, and you want to look up the associated element.
    The map data structure serves that purpose.
    A map stores key/value pairs.
    You can ﬁnd a value if you provide the key.
    For example, you may store a table of employee records,
    where the keys are the employee IDs and the values are Employee objects.

    The Java library supplies two general-purpose implementations for maps: HashMap and TreeMap.
    Both classes implement the Map interface.
    A hash map hashes the keys, and a tree map uses an ordering on the keys to organize them in a search tree.
    The hash or comparison function is applied only to the keys.
    The values associated with the keys are not hashed or compared.
    Should you choose a hash map or a tree map?
    As with sets, hashing is usually a bit faster,
    and it is the preferred choice if you don’t need to visit the keys in sorted order.
    Here is how you set up a hash map for storing employees:

    Map<String, Employee> staff = new HashMap<>();
    // HashMap implements Map Employee harry = new Employee("Harry Hacker");
    staff.put("987-98-9996", harry); . . .
    Whenever you add an object to a map, you must supply a key as well.
    In our case, the key is a string, and the corresponding value is an Employee object.
    To retrieve an object, you must use (and, therefore, remember) the key.
    String id = "987-98-9996";
    e = staff.get(id);
    // gets harry If no information is stored in the map with the particular key speciﬁed, get returns null.
    Keys must be unique.
    You cannot store two values with the same key.
    If you call the put method twice with the same key, the second value replaces the ﬁrst one.
    In fact, put returns the previous value associated with its key parameter.
    The remove method removes an element with a given key from the map.
    The size method returns the number of entries in the map.
    The easiest way of iterating over the keys and values of a map is the forEach method.
    Provide a lambda expression that receives a key and a value.
    That expression is invoked for each map entry in turn.
    Example:
    scores.forEach((k, v) ->
    System.out.println("key=" + k + ", value=" + v));


     */
}
