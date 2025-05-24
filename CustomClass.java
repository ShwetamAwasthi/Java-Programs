//Custom Class
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class CustomClass {
    public static void main(String[] args) {
        Employee shwetam = new Employee();
        shwetam.setName("shwetam");
        shwetam.salary = 1000000;
        System.out.println(shwetam.getName());
        System.out.println(shwetam.getSalary());
    }
}
