interface salary {
    void insertsalary(int salary);
}

class AD implements salary {
    int salary;

    @Override
    public void insertsalary(int salary) {
        this.salary = salary;
    }

    void printSalary() {
        System.out.println(this.salary);
    }
}

class WD implements salary {
    int salary;

    @Override
    public void insertsalary(int salary) {
        this.salary = salary;
    }

    void printSalary() {
        System.out.println(this.salary);
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        AD ob = new AD();
        // Insert different salaries
        ob.insertsalary(100000);
        System.out.print("Salary of Web Developer is ");
        ob.printSalary();
        WD ob1 = new WD();

        ob1.insertsalary(200000);
        System.out.printf("Salary of Web Developer is ");
        ob1.printSalary();
    }
}
