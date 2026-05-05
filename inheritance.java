class GrandParent {
    String grandFatherName;
    String grandMotherName;

    public void setGrandParentInfo(String grandFatherName, String grandMotherName) {
        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;
    }

    public void printGrandParentInfo() {
        System.out.println("GrandFather: " + grandFatherName);
        System.out.println("GrandMother: " + grandMotherName);
    }
}

class Parent extends GrandParent {
    String fatherName;
    String motherName;

    public void setParentInfo(String fatherName, String motherName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public void printParentInfo() {
        System.out.println("Father: " + fatherName);
        System.out.println("Mother: " + motherName);
    }
}

class Children extends Parent {
    String childrenName;
    int age;

    public void setChildrenInfo(String childrenName, int age) {
        this.childrenName = childrenName;
        this.age = age;
    }

    public void printChildrenInfo() {
        System.out.println("Children: " + childrenName);
        System.out.println("Age: " + age);
    }
}

public class inheritance {
    public static void main(String[] args) {

        Children ch = new Children();

        ch.setGrandParentInfo("Leo", "Rose");
        ch.setParentInfo("Chris", "Elsa");
        ch.setChildrenInfo("Tim", 22);

        ch.printGrandParentInfo();
        ch.printParentInfo();
        ch.printChildrenInfo();
    }
}