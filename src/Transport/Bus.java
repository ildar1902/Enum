package Transport;

public class Bus extends Transport implements Competing {
    public enum Capacity {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        ESPECIALLY_LARGE(100, 120);
        private Integer min;
        private Integer max;

        Capacity(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        @Override
        public String toString() {
            if (min == null && max == 10)
                return "до " + max + " мест";
            if (min == null && max == 25) {
                return "до " + max + " мест";
            }
            return min + "-" + max + " мест";

        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус \"" + getBrand() + "\" начал движение!");
    }

    @Override
    public void stop() {
        System.out.println("Автобус \"" + getBrand() + "\" остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус \"" + getBrand() + "\" заехал на пит-стоп!");
        System.out.println("Автобус \"" + getBrand() + "\" продолжил движение!");
    }

    @Override
    public int bestLapTime() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(5) + 14;
    }

    @Override
    public int maxSpeed() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(50) + 70;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Автобус \"" + getBrand() + "\" \"" + getModel() +  "\", Вместимость: " + capacity.toString();
    }
}
