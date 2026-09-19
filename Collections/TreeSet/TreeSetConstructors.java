import java.util.*;

class TreeSetConstructors {
    public static void main(String[] args) {

        // Set<Integer> tSet = new TreeSet<>(); // Default Constructor
        TreeSet<Integer> tSet = new TreeSet<>(); // Default Constructor
        tSet.add(99);
        tSet.add(2);
        tSet.add(1);
        tSet.add(7);
        tSet.add(5);
        System.out.println(tSet);

        // SortedSet Interface methods
        // System.out.println(tSet.First()); // Returns the first (lowest) element
        // Error as Set is the reference type and does not have the method First() defined in it. 
        // To use the method First(), we need to change the reference type to SortedSet. 
        // better to use TreeSet<Integer> tSet = new TreeSet<>(); // Default Constructor

        System.out.println("Smallest Value: " + tSet.first()); // Returns the first (lowest) element
        System.out.println("Largest Value: " + tSet.last()); // Returns the last (highest) element
        System.out.println("Head Set: " + tSet.headSet(5)); // Returns a view of the portion of this set whose elements are strictly less than toElement
        System.out.println("Tail Set: " + tSet.tailSet(5)); // Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        System.out.println("Sub Set: " + tSet.subSet(2, 7)); // Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive
        System.out.println("Size of TreeSet: " + tSet.size()); // Returns the number of elements in this set
        System.out.println("Is TreeSet Empty: " + tSet.isEmpty()); // Returns true if this set contains no elements
        System.out.println("Does TreeSet contain 5: " + tSet.contains(5)); // Returns true if this set contains the specified element
        System.out.println("Lower Value: " + tSet.lower(5)); // Returns the greatest element in this set strictly less than the specified element
        System.out.println("Higher Value: " + tSet.higher(5)); // Returns the smallest element in this set strictly greater than the specified element  
        System.out.println("Floor Value: " + tSet.floor(50)); // Returns the greatest element in this set less than or equal to the given element, or null if there is no such element 
        System.out.println("Ceiling Value: " + tSet.ceiling(6)); // Returns the least element in this set greater than or equal to the given element, or null if there is no such element
        // System.out.println("Poll First Value: " + tSet.pollFirst()); // Retrieves and removes the first (lowest) element, or returns null if this set is empty
        // System.out.println("Poll Last Value: " + tSet.pollLast()); // Retrieves and removes the last (highest) element, or returns null if this set is empty
        System.out.println("TreeSet after Polling: " + tSet); // Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        System.out.println("Size of TreeSet after Polling: " + tSet.size()); // Returns the number of elements in this set

        System.out.println("Reverse Order: " + tSet.descendingSet()); // Returns a reverse order view of the elements contained in this set
        
        System.out.println("Navigable Head Set: " + tSet.headSet(7, true)); // Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement  
        System.out.println("Navigable Tail Set: " + tSet.tailSet(5, true)); // Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement
        System.out.println("Navigable Sub Set: " + tSet.subSet(2, true, 7, true)); // Returns a view of the portion of this set whose elements range from fromElement to toElement
        
        
        // pollFirst() removes the smallest value
            // pollLast() removes the largest value

        Iterator<Integer> iterator = tSet.descendingIterator(); // Returns an iterator over the elements in this set in ascending order
        System.out.print("Descending Order using DescendingIterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();   


        // Set<String> tSet2 = new TreeSet<>(List.of("banana", "apple", "cherry")); // Constructor with Collection
        // System.out.println(tSet2);
    }


}