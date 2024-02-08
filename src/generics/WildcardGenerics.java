package generics;

import java.nio.file.FileSystemLoopException;
import java.util.ArrayList;

public class WildcardGenerics {

    public static void main(String[] args) {
        Dev dev1 = new Dev();
        Employee emp1 = new Employee();
        emp1 = dev1;
        // That's polymorfism, I can assign a child class object to a super class one

        ArrayList<Dev> devs = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        // devs = employees;
        // But I can't do this to a array

        // Using ? wildcard I can assign any generic class here
        ArrayList<?> employees2 = new ArrayList<>();
        employees2 = new ArrayList<Dev>();


        // Upper bound
        // Using ? extends Employee, I can assign any class that is child of Employee class
        ArrayList<? extends Employee> extended = new ArrayList<>();
        extended = devs;

        // Lower bound
        // Using ? super Employee, I can assign any class that is parent of Employee class
        ArrayList<? super Employee> supers = new ArrayList<>();
        supers = new ArrayList<Object>();

        ArrayList<Employee> workers = new ArrayList<>();
        workers.add(new Dev());
        workers.add(new HR());
        workers.add(new Employee());
        workers.add(new Dev());
        makeEmployeesWork(workers);
    }

    // This method accepts any ArrayList of types that are child of Employee
    // and it has access to only methods of Employee;
    public static void makeEmployeesWork(ArrayList<? extends Employee> employees) {
        for (Employee emp :  employees) {
            emp.work();
        }
    }
}
