package Ex_49;

public class Students {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
