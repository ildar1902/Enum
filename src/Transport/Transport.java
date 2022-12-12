package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (StringUtils.isNotEmpty(brand)) {
            this.brand = brand;
        } else {
            this.brand = "Укажите марку";
        }
        if (StringUtils.isNotEmpty(model)) {
            this.model = model;
        } else {
            this.model = "Укажите модель";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public abstract void printType();

    public abstract void start();

    public abstract void stop();

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + getEngineVolume();
    }
}
