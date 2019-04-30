package jiekou;

public class Teacher extends Person{

    public Teacher(){};

    public Teacher(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("Teacher eat");
    }
}
