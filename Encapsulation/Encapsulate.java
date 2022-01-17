package Encapsulation;

public class Encapsulate {
    public static void main(String[] args) {
        // System.out.println("shuaib");

        Customer customer = new Customer();

        // Set details of the employee.
        customer.setName("shuaib");
        customer.setSalary(100000);
        customer.setCustomerId("C101");

        // Print Detatils of the Employee.
        System.out.println("Emp Name " + customer.getName());
        System.out.println("Emp Salary is " + customer.getSalary());
        System.out.println("Emp Id " + customer.getCustomerId());
    }
}

class Customer {
    private String name;
    private int salary;
    private String customerId;

    // Set method (to set the value of employee because we can't direct use of the
    // class variable)

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // Get method fetch the value of employee.
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}
