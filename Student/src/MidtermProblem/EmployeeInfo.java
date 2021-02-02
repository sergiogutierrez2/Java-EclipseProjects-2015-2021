package MidtermProblem;


class EmployeeInfo implements Filter {
@Override
public boolean accept(String x) {
   return x.contains("j") || x.contains("J");
   }
}

