package duotai;

public class Zi extends Fu{
    int num = 100;
    int num2 = 300;
    public void show(){
        System.out.println("show Zi");
    }
    public static void function(){
        System.out.println("function Zi");
    }
    public void method(){
        System.out.println("method Zi");
    }

    public static void main(String[] args) {
        Fu f= new Zi();
        System.out.println(f.num);
        f.show();
//        f.method();

    }
}
