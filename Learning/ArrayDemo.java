import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

class Student{

    int id;
    String name;

    Student(int id, String name){

        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "The name is "+name+" and the id is "+id;
    }
}

public class ArrayDemo {
    
    public static void main(String[] args) {
        
        int javaArray[] = new int[10];
        for(int i = 0; i < javaArray.length; i++){
            javaArray[i] = i*2;
        }

        for(int i: javaArray){
            System.out.println(i);
        }

        ArrayList<Student> list_S = new ArrayList<Student>();
        list_S.add(new Student(10, "abc"));
        list_S.add(new Student(20, "def"));

        for(Student s: list_S){
            System.out.println(s);
        }

    }
}
