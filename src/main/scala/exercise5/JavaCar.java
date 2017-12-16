package exercise5;

public class JavaCar {

    private final String manufacturer;
    private final String modelName;

    private int year = -1;
    private String license = "";

    public JavaCar(String manufacturer, String modelName) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
    }

    public JavaCar(String manufacturer, String modelName, int year) {
        this(manufacturer, modelName);
        this.year = year;
    }

    public JavaCar(String manufacturer, String modelName, String license) {
        this(manufacturer, modelName);
        this.license = license;
    }

    public JavaCar(String manufacturer, String modelName, int year, String license) {
        this(manufacturer, modelName);
        this.year = year;
        this.license = license;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
