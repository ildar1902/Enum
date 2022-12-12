package Transport;


public class Truck extends Transport implements Competing {
    public enum LoadCapacity {
        N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);

        Float min;
        Float max;

        LoadCapacity(Float min, Float max) {
            this.min = min;
            this.max = max;
        }

        public Float getMin() {
            return min;
        }

        public Float getMax() {
            return max;
        }

        public void setMin(Float min) {
            this.min = min;
        }

        public void setMax(Float max) {
            this.max = max;
        }


        @Override
        public String toString() {
            if (min == null)
                return "до " + max + " тонн";
            if (max == null) {
                return "свыше " + min + " тонн";
            }
            return "от " + min + " тонн до " + max + " тонн";
        }
    }
    public enum TransportType {
        TRUCK("Грузовик");
        private final String typeName;

        TransportType(String typeName) {
            this.typeName = typeName;
        }
        public String getTypeName() {
            return typeName;
        }
    }
    private final TransportType transportType;
    private LoadCapacity loadCapacity;

    public Truck(TransportType transportType, String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
        this.transportType = transportType;

    }

    @Override
    public void printType() {
        if (transportType != null) {
            System.out.println("Тип транспортного средства: " + transportType.getTypeName());
        } else {
            System.out.println("По транспортному средству недостаточно данных!!!");
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    @Override
    public void start() {
        System.out.println("Грузовик \"" + getBrand() + "\" начал движение!");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик \"" + getBrand() + "\" остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Гузовик \"" + getBrand() + "\" заехал на пит-стоп!");
        System.out.println("Гузовик \"" + getBrand() + "\" продолжил движение!");
    }

    @Override
    public int bestLapTime() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(4) + 9;
    }

    @Override
    public int maxSpeed() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(50) + 100;
    }

    @Override
    public String toString() {
        return "Грузовик " + getBrand() + " " + getModel() + ", Грузоподъёмность: " + loadCapacity.toString();
    }
}
