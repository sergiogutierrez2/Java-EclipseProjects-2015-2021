package MidtermProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDataStorage {
    private Map<Integer, Filter> employees = new HashMap<Integer, Filter>();

    public Filter getEmployeeById(int id) {
        return employees.get(id);
    }
    public ArrayList<Filter> getAllEmployees() {
        ArrayList<Filter> allEmployees = new ArrayList<>();
        for (int id : employees.keySet()) {
            allEmployees.add(employees.get(id));
        }
        return allEmployees;
    }

    public EmployeeDataStorage() {
        initializeData();
    }

    private void initializeData() {
        // don't need to include this method into interface
        // it is just simulating that we have some data
        employees.put(1, "Amos Burton");
        employees.put(2, "Julie Mao");
        employees.put(3, "Alex Kamal");
        employees.put(4, "James Holden");
        employees.put(5, "Josephus Miller");
        employees.put(6, "Bobbie Draper");
    }
}
