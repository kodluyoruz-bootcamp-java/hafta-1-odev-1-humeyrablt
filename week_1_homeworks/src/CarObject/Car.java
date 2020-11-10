package CarObject;

public class Car {
    private String color;
    private String model;
    private int modelYear;
    private String fueltype;
    private int km;

    public Car() {
        System.out.println("Arabanın Özellikleri:");
    }

    public Car(String color, String model, int modelYear, String fueltype, int km) {
        System.out.println("Rengi:" + color);
        System.out.println("Modeli:" + model);
        System.out.println("Model yılı:" + modelYear);
        System.out.println("Yakıt türü:" + fueltype);
        System.out.println("Km:" + km);
    }
}
