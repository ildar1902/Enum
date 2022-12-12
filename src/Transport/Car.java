package Transport;

public class Car extends Transport implements Competing {
    public enum Body {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String name;

        Body(String name) {
            this.name = name;
        }

        public String getName() {
            return name;

        }
    }

    public enum TransportType {
        CAR("Легковой автомобиль");
        private final String typeName;

        TransportType(String typeName) {
            this.typeName = typeName;
        }
        public String getTypeName() {
            return typeName;
        }
    }
    private final TransportType transportType;
    private final Body bodyType;

    public Car(TransportType transportType, String brand, String model, double engineVolume, Body bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
        this.transportType = transportType;
    }

    public Body getBodyType() {
        return bodyType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    @Override
    public void printType() {
        if (transportType != null) {
            System.out.println("Тип транспортного средства: " + transportType.getTypeName());
        } else {
            System.out.println("По транспортному средству недостаточно данных!!!");
        }
    }

    @Override
    public void start() {
        System.out.println("Автомобиль \"" + getBrand() + "\" начал движение!");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() + "\" остановился!");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль \"" + getBrand() + "\" заехал на пит-стоп!");
        System.out.println("Автомобиль \"" + getBrand() + "\" продолжил движение!");
    }

    @Override
    public int bestLapTime() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(4) + 5;
    }

    @Override
    public int maxSpeed() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(50) + 170;
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() + " " + getModel() + ", Тип кузова: " + bodyType.getName();

    }
}

