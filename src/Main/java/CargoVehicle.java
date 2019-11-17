package Main.java;

/**
 * a vehicle that does cargo.
 */
public abstract class CargoVehicle implements Vehicle {

    /**
     * max weight capacity
     */
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
