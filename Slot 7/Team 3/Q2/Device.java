public class Device {
 // Attributes for brand and model
    private String brand;
    private String model;

    // Constructor to initialize the attributes
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method to display device information
    public void displayDeviceInfo() {
        System.out.println("Device: " + brand + " " + model);
    }

    // Getters (optional, if needed)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
