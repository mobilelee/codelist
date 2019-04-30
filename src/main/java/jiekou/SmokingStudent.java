package jiekou;

public class SmokingStudent extends Student implements Smoking {

    SmokingStudent(){};
    SmokingStudent(String name,int age){
        super(name, age);
    }

    public void smoke(){
        System.out.println("Student Smoking");
    }

}
