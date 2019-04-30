package chouxiang;

public class WorkTeacher extends Teacher{
    public WorkTeacher(){};
    public WorkTeacher(String name ,int age){
        super(name,age);
    }
    public void teacher(){
        System.out.println("就业班老师");
    }

}
