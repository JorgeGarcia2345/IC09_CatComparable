import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // arraylists, collection of related data,
        // under a single data type that is:
        // dynamically sized, can grow/shrink
        // example, fixed array, cant grow, cant shrink, using counters, have to wrry about nulls
        //Cat [] clowder = new Cat[100];

        // List > ArrayList > LinkedList
        List<Cat> clowder = new ArrayList<>();
        //ArrayList<Cat> clowder = new ArrayList<>();

        // Default capacity = 10
        // when it hits capacity, c10
        // Doubles in capacity <null x 10>
        // new array is going to be to different memory
        // doubles current size, ex: 1 > 2 > 4 > 8 > 16 etc.
        // ArrayList<Cat> clowder = new ArrayList<>(25); 25 > 50
        // doubling is inefficient

        // Cat cole = new Cat("Cole", "Orange", 6);
        // add cats to arraylist - clowder
        clowder.add(new Cat("Boba Pearl", "Tuxedo", 2));
        clowder.add(new Cat("Dino", "Black", 8));
        clowder.add(new Cat("Cole", "Orange", 6)); // clowder.add(cole);
        clowder.add(new Cat("Lucy", "Orange", 8));
        clowder.add(new Cat("Winona", "Black", 3));

        // to remove
        // either by index
        //clowder.remove(2);

        // OR object

        // clowder.remove(cole);

        // clowder.clear(); - Nulls out all the cats
        // size goes back to 0
        // capacity is still 10 - DEFAULT

        // when removed, all indexes move down one
        // removed [2] shifts [3] down to [2]

        // with arraylists, can be automatically sorted
        // in ascending order
        System.out.println("\n~~~~UNSORTED clowder of Cats~~~~");

        // Use a for each loop w/ ArrayLists
        // for each cat obj. (c) in the arrayList names clowder
        // FOR EACH ( ALL )
        for (Cat c : clowder) {
            System.out.println(c);
        }

        // for i = certain size
        // traditional for loop
        /*
        for (int i = 0; i < clowder.size(); i++) {
            System.out.println(clowder.get(i));
        }
         */

        Collections.sort(clowder);

        System.out.println("\n~~~~SORTED clowder of Cats~~~~");
        for (Cat c : clowder) {
            System.out.println(c);
        }


    }
}
/*
    // Interface - Purely abstract class
    // cant instantiate
    // no public constructor
    // no to String


    // Abstract method, with no body, ONLY SIGNATURE
    //

    // Set of things that can be done, a contract
    Nintendo controller, 8 methods
    public interface NES
    {
        public abstract aButton();

        public abstract bButton();
    }

    Ex: Zelda using the NES Interface
    Zelda implements interface

 */
