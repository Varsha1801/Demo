package day2;
class Emp {
    String name;
    int age;
    String dept;
    double salary;
    

    //method to print info
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.dept);
        System.out.println(this.salary);
    }
}

public class Employee {

	public static void main(String[] args) {
		Emp e1 = new Emp();
        e1.name="Spurthee";
        e1.age=23;
        e1.dept="Developer";
        e1.salary=50000.00;
        //method call
        e1.printInfo();

	}

}
