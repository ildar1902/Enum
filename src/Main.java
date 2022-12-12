import Transport.Bus;
import Transport.Car.Body;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {

        System.out.println("       Урок Enum");

//        Урок "Перечисления". ДЗ.
//        Задание 1
        System.out.println("    Enum. ДЗ");
        System.out.println("Задание 1");
        System.out.println();
        Car allion = new Car("Toyota", "Allion", 1.8, Body.SEDAN);
        System.out.println(allion);
        System.out.println();
        Car almera = new Car("Nissan", "Almera", 1.6, Body.SEDAN);
        System.out.println(almera);
        System.out.println();
        Car priora = new Car("Lada", "Priora", 1.6, Body.HATCHBACK);
        System.out.println(priora);
        System.out.println();
        Truck kamaz = new Truck("КамАЗ", "4355", 6.7, Truck.LoadCapacity.N2);
        System.out.println(kamaz);
        System.out.println();
        Truck kamaz2 = new Truck("КамАЗ", "5233", 8.7, Truck.LoadCapacity.N3);
        System.out.println(kamaz2);
        System.out.println();
        Bus paz = new Bus("ПАЗ", "Вектор", 3.0, Bus.Capacity.LARGE);
        System.out.println(paz);
        System.out.println();
        Bus maz = new Bus("МАЗ", "1034", 3.5, Bus.Capacity.ESPECIALLY_LARGE);
        System.out.println(maz);

    }
}