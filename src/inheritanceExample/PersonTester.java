package inheritanceExample;

public class PersonTester {

    public static void main(String[] args) {
        Person sally = new Person("sally", "phillips");
        System.out.println(sally);
        Student mike = new Student("mike", "wong", "12345");
        System.out.println(mike);
        StudentEmployee Gary = new StudentEmployee("Gary", "Tsai", "2323", 20.5, "#32341");
        System.out.println(Gary);
    }
}
