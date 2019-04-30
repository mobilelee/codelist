package chouxiang;

public class BasicTeacher extends Teacher{
    public BasicTeacher(){};
    public BasicTeacher(String name,int age){
        super(name,age);
    }

    public void teacher(){
        System.out.println("基础班教学");
    }
}
