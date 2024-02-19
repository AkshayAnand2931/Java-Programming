import java.util.*;

class Student{

    int rollno;
    String name;

    Student(int rollno, String name){

        this.rollno = rollno;
        this.name = name;
    }

    public String toString(){
        return "Roll no is: "+ rollno + " and the name is: "+ name;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("Hello");
        list1.add("World");

        System.out.println(list1);

        for(String i: list1){
            System.out.println(i);
        }

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("d");
        list2.add("e");
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);

        System.out.println(list1.equals(list2));
        System.out.println(list1.isEmpty());
        System.out.println(list1.indexOf("Hello"));

        System.out.println(list1.contains("hi"));

        list2.remove("d");
        list2.clear();

        ArrayList<String> list3 = new ArrayList<String>();
        list3 = (ArrayList) list2.clone();
        System.out.println(list3.hashCode());
        System.out.println(list1.hashCode());

        //Using Student Class to do the above

        ArrayList<Student> s1 = new ArrayList<Student>();

        s1.add(new Student(1, "A"));
        s1.add(new Student(2, "B"));
        s1.add(new Student(3, "C"));

        System.out.println(s1);
        for(Student s: s1){
            System.out.println(s);
        }

        ArrayList<Student> s2 = new ArrayList<Student>();
        s2.add(new Student(4, "D"));
        s2.add(new Student(5, "E"));
        s1.addAll(s2);

        System.out.println(s1.contains(new Student(5,"E")));
    }
}
