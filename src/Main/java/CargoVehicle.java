package Main.java;

public abstract class CargoVehicle implements Vehicle {

    private double weightCapacity;

    @Override
    public void move() {
        System.out.println("Im moving with cargo");
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }


}
