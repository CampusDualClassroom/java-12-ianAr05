package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    // Constructor con parámetros
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.fuel = "Gasoline";
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            this.gear = "N";
            this.reverse = false;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo en movimiento");
        }
    }

    public void accelerate() {
        if (this.tachometer > 0 && this.speedometer < MAX_SPEED) {
            this.speedometer += 5;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;
            }
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 5;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
        }
    }

    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;
        if (newAngle > 45) {
            this.wheelsAngle = 45;
        } else if (newAngle < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = newAngle;
        }
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0 && reverse) {
            this.reverse = true;
            this.gear = "R";
        } else if (!reverse) {
            this.reverse = false;
            this.gear = "N";
        } else {

        }
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + fuel);
        System.out.println("Speedometer: " + speedometer);
        System.out.println("Tachometer: " + tachometer);
        System.out.println("Gear: " + gear);
        System.out.println("Reverse: " + reverse);
        System.out.println("Wheels angle: " + wheelsAngle);
    }
}
