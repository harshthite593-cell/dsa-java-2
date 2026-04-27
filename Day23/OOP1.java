public class OOP1 {
    public static void main(String[] args) {

        Student harsh = new Student("Harsh", 21, 43);

        System.out.println(harsh.name);
        System.out.println(harsh.age);
        System.out.println(harsh.rollno);
        Student harsh2  = new Student("karsh" , 19, 37);
        System.out.println(harsh2.name);
        System.out.println(harsh2.age);
        System.out.println(harsh2.rollno);
        Student harsh3 = new Student(harsh);
        System.out.println(harsh3.name);
    }
}

class Student {
    String name;
    int age;
    int rollno;

    // Constructor
    Student(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    Student( Student other) {
        this.name =other.name;
        this.age = other.age;
        this.rollno = other.rollno;
    }
};