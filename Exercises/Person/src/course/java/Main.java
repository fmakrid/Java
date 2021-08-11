package course.java;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Smith");
        person.setAge(13);
        System.out.println(person.getFullName() + " " + person.isTeen());
    }
}
