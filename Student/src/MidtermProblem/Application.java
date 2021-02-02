package MidtermProblem;

import java.util.ArrayList;


public class Application {
    EmployeeDataStorage dataStorage;

    public Application(EmployeeDataStorage ds) {
        this.dataStorage = ds;
    }

    public void printEmployee(int id) {
        System.out.println(dataStorage.getEmployeeById(id));
    }

    public void printAllEmployees() {
        ArrayList<Filter> allEmployees = dataStorage.getAllEmployees();
        for (Filter employee : allEmployees) {
            System.out.println(employee);
        }
    }
}
