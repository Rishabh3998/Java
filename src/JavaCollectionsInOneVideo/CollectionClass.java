package JavaCollectionsInOneVideo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void collectionClass () {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(52);

        System.out.println("Min " + Collections.min(list));
        System.out.println("Max " + Collections.max(list));
        System.out.println("Frequency " + Collections.frequency(list, 22));

        //        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        List<Student> st = new ArrayList<>();

        st.add(new Student("Rishabh", 1));
        st.add(new Student("Ritik", 2));
        st.add(new Student("Vansh", 3));
        st.add(new Student("Varun", 2));

        System.out.println(st);

        Collections.sort(st);

        System.out.println(st);

        Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student one, Student two) {
                return one.name.compareTo(two.name);
            }
        });

        System.out.println(st);

        Collections.sort(st, (one, two) -> one.name.compareTo(two.name));

    }
}


