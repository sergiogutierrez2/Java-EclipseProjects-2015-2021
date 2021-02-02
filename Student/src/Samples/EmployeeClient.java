package Samples;

public class EmployeeClient {

    public static void main(String[] args) {

        EmployeeView view = new EmployeeView();
        EmployeeModel model = new EmployeeModel();
        EmployeeController cntlr = new EmployeeController(view, model);
        view.open();

    }
}
