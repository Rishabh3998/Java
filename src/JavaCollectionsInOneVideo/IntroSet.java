package JavaCollectionsInOneVideo;
import java.util.*;

public class IntroSet {
    public static void set () {
        // only uniques elements are allowed in a set
        // element order is not defined here it can be random order
        Set<Integer> s = new HashSet<>(); // operations: O(1)
        s.add(12);
        s.add(1223);
        s.add(121);
        s.add(2);
        s.add(132);
        System.out.println(s);
        s.remove(121);
        System.out.println(s);
        System.out.println(s.contains(12)); // returns a boolean
        System.out.println(s.isEmpty());
        System.out.println(s.size()); // no. of elements present in set
        s.clear();
        System.out.println(s);

        Set<Integer> ls = new LinkedHashSet<>(); // LinkedList + set : elements will be in an order
        ls.add(12);
        ls.add(1223);
        ls.add(121);
        ls.add(2);
        ls.add(132);
        System.out.println(ls);
        ls.remove(121);
        System.out.println(ls);
        System.out.println(ls.contains(12)); // returns a boolean
        System.out.println(ls.isEmpty());
        System.out.println(ls.size()); // no. of elements present in set
        ls.clear();
        System.out.println(ls);

        Set<Integer> ts = new TreeSet<>(); // Maintain every thing in a sorted order (Unique + sorted elements)
        // operations: O(logN)
        ts.add(12);
        ts.add(1223);
        ts.add(121);
        ts.add(2);
        ts.add(132);
        System.out.println(ts);
        ts.remove(121);
        System.out.println(ts);
        System.out.println(ts.contains(12)); // returns a boolean
        System.out.println(ts.isEmpty());
        System.out.println(ts.size()); // no. of elements present in set
        ts.clear();
        System.out.println(ts);

        // Sets of custom class
        Set<Student> st = new HashSet<>();
        st.add(new Student("Rishabh", 1));
        st.add(new Student("Ritik", 2));
        st.add(new Student("Vansh", 3));
        st.add(new Student("Varun", 2));

        System.out.println(st); // This will print all the students irrespective of the same rollNo because
        // every time a new object instance is created which is unique itself.
        // But we need to differentiate according to the rollNo. Therefore we can use equals() and hashcode() methods
        // in the respective class.
    }
}

class Student implements Comparable<Student>{
    String name;
    int rollNo;

    public Student (String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}
