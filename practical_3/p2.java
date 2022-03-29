class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Data of the Person: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class p2 extends Person {
    public String branch;
    public int enNo;

    public p2(String name, int age, String branch, int enNo) {
        super(name, age);
        this.branch = branch;
        this.enNo = enNo;
        displayStudent();
    }

    public void displayStudent() {
        System.out.println("Data of the Student: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Branch: " + this.branch);
        System.out.println("Student ID: " + this.enNo);
    }

    public static void main(String[] args) {
        Person person = new p2("Priyanka", 20, "IT", 045);
        person.displayPerson();
    }
}