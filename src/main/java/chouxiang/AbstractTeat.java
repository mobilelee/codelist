package chouxiang;

public class AbstractTeat {

    public static void main(String[] args) {
        Teacher t = new BasicTeacher();
        t.setAge(25);
        t.setName("Jason");
        System.out.println(t.getAge()+"------"+t.getName());
        t.teacher();

        t = new BasicTeacher("Jason",25);
        System.out.println(t.getAge()+"------"+t.getName());

        t = new WorkTeacher();
        t.setName("Wolf");
        t.setAge(30);
        System.out.println(t.getAge()+"------"+t.getName());

        t = new WorkTeacher("Wolf",30);
        System.out.println(t.getAge()+"------"+t.getName());
    }
}
