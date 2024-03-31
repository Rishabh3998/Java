package JavaCollectionsInOneVideo;

import java.util.*;

public class IntroArrayList {
    // ArrayList is a dynamic version of array
    // When size of ArrayList gets 0 a new ArrayList of size = n + n/2 + 1 gets created and copy all the previous elements
    // in this new ArrayList.


    public static void arrayList () {
        // String[] students = new String[30];
        // Current students
        // students[0] = "Rishabh";
        //
        // ....students[1] = "name";
        //
        // students[29] = "Ritik";

        // New Student
        // students[30] = "Vansh"; // not possible Index out of bound

        ArrayList<String> students = new ArrayList<>();
        students.add("Rishabh");
        System.out.println(students);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);

        // Adding at an index
        list.add(2, 40); // O(n)
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(200);

        // This will append every element from newList to list
        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(2)); // accessing element via index

        list.remove(4); // remove from the given index O(n)
        System.out.println(list);

        list.remove(Integer.valueOf(100)); // remove via value O(n)
        System.out.println(list);

        //        list.clear();
        //        System.out.println(list);
        list.set(2, 1000);
        System.out.println(list);

        boolean isThere = list.contains(1000); // O(n)
        System.out.println(isThere);

        // size returns total count of elements present
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.print(list.get(i) + ", ");
        }

        System.out.println();
        for (int val : list) {
            System.out.print(val + ", ");
        }

        // Iterator:
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }

    public static void stack () {
        // LIFO
        Stack<String> animals = new Stack<>();
        animals.push("Vansh");
        animals.push("Ritik");
        animals.push("Varun");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals);
    }

    public static void linkedList () {
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(24);
        System.out.println(list);
        // Rest methods are also same as List/ArrayList
    }
}
