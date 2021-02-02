class BulbTester {
    public static void main(String[] args) {
        SmartBulb smart = new SmartBulb();
        LightBulb bulb = smart;

        bulb.light();
    }
}