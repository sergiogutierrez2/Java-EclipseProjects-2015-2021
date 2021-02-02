public class Laptop extends Computer {
  
    int batteryCapacity;
    int batteryLevel;

    public Laptop(int numberOfCores, int batteryCapacity) {
        super (numberOfCores);
        this.batteryCapacity = batteryCapacity;
        // imagine that at the beginning the battery is fully charged, i.e the same size as capacity
        this.batteryLevel = batteryCapacity;
    }

    public void charge(int minutes) {
        // charge laptop by one unit per minute
        // but can't charge it more than its battery capacity
        for (int i = 0; i < minutes; i++) {
            if (batteryLevel < batteryCapacity) {
                batteryLevel++;
            }
        }
    }

    @Override
    public void work() {
        // can only work if its battery is not empty
        if (batteryLevel > 0) {
            System.out.println("Calculating... beep boop beep beep boop...");
        }
    }
}