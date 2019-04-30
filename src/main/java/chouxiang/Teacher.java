package chouxiang;

abstract class Teacher {
    public int age;
    public String name;

    public Teacher(){};

    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void teacher();
}
