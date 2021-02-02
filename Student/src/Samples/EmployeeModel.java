package Samples;

public class EmployeeModel {

    private String[] names = { "Ryan", "Mike", "Joe" };
    private int index;

    public EmployeeModel() {
    }

    public String getNextName() {
        return names[index++ % names.length];
    }

}