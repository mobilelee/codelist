package jiekou;

public class SmokingTeacher extends Teacher implements Smoking{

        SmokingTeacher(){};
        SmokingTeacher(String name,int age){
            super(name, age);
        }

        public void smoke(){
            System.out.println("Teacher Smoking");
        }

}
