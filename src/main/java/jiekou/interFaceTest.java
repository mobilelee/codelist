package jiekou;

public class interFaceTest {

    public static void main(String[] args) {
        SmokingTeacher teacher = new SmokingTeacher();
        teacher.setName("XXXXXX");
        teacher.setAge(1);
        teacher.eat();
        teacher.sleep();
        teacher.smoke();
        System.out.println(teacher.getAge()+"--------"+teacher.getName());

        SmokingTeacher st = new SmokingTeacher("CCCCC",6);
        System.out.println(st.getAge()+"--------"+st.getName());
    }


}
