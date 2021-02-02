package Homework3;

public class Model {
    int redNumber;
    int orangeNumber;
    int yellowNumber;

    GraphView gView;

    public Model(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.orangeNumber = n2;
        this.yellowNumber = n3;
    }

    public void attach(GraphView gView) {
        this.gView = gView;
    }

    public void updateValues(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.orangeNumber = n2;
        this.yellowNumber = n3;
        gView.updateGraph(n1, n2, n3);
        // call method on graphView object to update itself
    }
}