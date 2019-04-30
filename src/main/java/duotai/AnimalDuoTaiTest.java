package duotai;

public class AnimalDuoTaiTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        System.out.println("---------------");

        Dog d = (Dog) a;
        d.eat();
        d.lookDoor();
        System.out.println("---------------");

        a = new Cat();
        a.eat();
        System.out.println("----------------");

        Cat c = (Cat) a;
        c.eat();
        c.playGame();

        //错误实例
       // Dog dd = new Animal();//要类型一致
        //Dog ddd = new Cat();/要类型一致
        //Dog dddd = (Dog) a; 此时的a已经成了new出来的cat，跟dog类型不一致，所以虽编译时不报错但运行时报错
    }
}
