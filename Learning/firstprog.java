
class Student{
    int id;
    String name;

    void display(){

        System.out.println("Name of the student is: "+name+ " id is: "+id);
    }

    void setstudent(String name, int id){
        this.name = name;
        this.id = id;
    }
}

class firstprog{

    public static void main(String args[]){
        
        Student s1 = new Student();
        s1.setstudent("AK",10);
        s1.display();
        System.out.println("Hello World!!");
    }
}