class Vehicle {
    String vehicle_type;

    Vehicle(String type) {
        vehicle_type = type;
    }

    void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

class Car extends Vehicle {
    String model_type;
    String company;

    Car(String type, String model, String comp) {
        super(type);
        model_type = model;
        company = comp;
    }

    void display() {
        super.display();
        System.out.println("Model: " + model_type);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        Car c = new Car("Four Wheeler", "SUV", "Toyota");
        c.display();
    }
}
