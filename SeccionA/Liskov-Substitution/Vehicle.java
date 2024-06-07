class Vehicle {
    public void startEngine() {
        System.out.println("The vehicle's engine is starting.");
    }

    public void stopEngine() {
        System.out.println("The vehicle's engine is stopping.");
    }

    public void drive() {
        System.out.println("The vehicle is driving.");
    }
}

class Car extends Vehicle {
    // El carro puede usar los mismo métodos sin cambios
}

class ElectricCar extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The electric car is powering up.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The electric car is shutting down.");
    }
}
