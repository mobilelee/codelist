package jiekou;

public class Student extends Person{

    public Student(){};
    public Student(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("Student eat");
    }
}
