public class Person {
    private String name;
    private String job;
    private String placeOfWork;
    private int age;
    private double salary;


    public Person() {

    }

    public Person(String name, String job, String placeOfWork, int age, double salary) {
        this.name = name;
        this.job = job;
        this.placeOfWork = placeOfWork;
        this.age = age;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public String getPlaceOfWork() {
        return placeOfWork;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}