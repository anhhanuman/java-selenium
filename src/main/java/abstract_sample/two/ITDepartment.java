package abstract_sample.two;

import abstract_sample.two.Employee;

public abstract class ITDepartment implements Employee {
/*
The IT Department does not have the capability to implement the salary. So, I  make it as abstract function, and HRTeam class should implement the salary function
Therefore, this class becomes an abstract class.
 */
    @Override
    public abstract void getSalary();


    @Override
    public void getWelcomeKits() {
    System.out.println("Hello new developer. You're welcomed to the IT department. This is the Laptop for you");
    }

    @Override
    public void workAsProgrammer() {
    System.out.println("Hello new developer. Your work is relating to software development");
    }
}
