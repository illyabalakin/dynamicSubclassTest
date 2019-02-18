public class main {



    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("Car");
        Class clazz2 = Class.forName("Truck");

        Vehicle demo = (Vehicle) clazz.newInstance();
        demo.drive();

        Vehicle demo2 = (Vehicle) clazz2.newInstance();
        demo2.drive();
    }


}
