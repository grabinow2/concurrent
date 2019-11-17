package Main.java;

/**
 * @author gedal
 * @version
 *
 * An abstract representation of a Vehicle that exclusively carries cargo.
 *
 * @see Vehicle
 */
public abstract class CargoVehicle implements Vehicle {

    /**
     * The maximum amount of cargo that can be carried by this object.
     * To be represented in metric kilograms.
     */
    private double weightCapacity;

    @Override
    public String move() {
        return "Im moving with cargo";
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }


}
