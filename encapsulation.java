class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Leo");

        String name = obj.getName();
        int age = obj.getAge();

        System.out.println("User name: " + name + "Age" + age);
    }
}
