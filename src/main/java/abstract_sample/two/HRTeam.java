package abstract_sample.two;

public class HRTeam extends ITDepartment {
    /*
    Here the HRTeam extends the ITDepartment, so that it can access the methods in that class such as getWelcomeKits(), work()
    Have to provide the implementation for the abstract salary function. Otherwise, the Error occurs
     */
    @Override
    public void getSalary(){
        System.out.println("Hello developer, the junior developer should have 500$ per month as implemented by the HRTeam");
    }

    public static void main(String[] args){
        /*
        Can you create an instance object of the ITDepartment -> NO: Error because ITDepartment is an abstract class
        Employee newIT = new ITDepartment();
         */

        Employee newEmployee= new HRTeam();
        newEmployee.getWelcomeKits();
        newEmployee.workAsProgrammer();
        newEmployee.getSalary();
    }
}
