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
public enum TransportType {
    BUS("Автобус");
    private final String typeName;
    TransportType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
    private Capacity capacity;
    private final TransportType transportType;

    public Bus(TransportType transportType, String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
//        if (transportType != null) {
            this.transportType = transportType;
//        } else {
//            this.transportType = TransportType.BUS;
//        }

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

    public TransportType getTransportType() {
        return transportType;
    }

    @Override
    public String toString() {
        return transportType.toString() + " \"" + getBrand() + "\" \""
                + getModel() +  "\", Вместимость: " + capacity.toString();
    }

}
