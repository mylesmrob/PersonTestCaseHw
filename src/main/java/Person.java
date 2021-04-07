public class Person {
    private String name;
    private int age;
    private double studyHours;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(double studyHours) {
        this.studyHours = studyHours;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, double studyHours){
        this.name = name;
        this.studyHours = studyHours;
    }

    public Person(int age, double studyHours){
        this.age = age;
        this.studyHours = studyHours;
    }

    public Person(String name, int age, double studyHours) {
        this.name = name;
        this.age = age;
        this.studyHours = studyHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(double studyHours) {
        this.studyHours = studyHours;
    }
}
