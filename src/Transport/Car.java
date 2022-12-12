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


    private Body bodyType;

    public Car(String brand, String model, double engineVolume, Body bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public Body getBodyType() {
        return bodyType;
    }

    public void setBodyType(Body bodyType) {
        this.bodyType = bodyType;
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

