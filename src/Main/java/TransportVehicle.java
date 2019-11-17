package Main.java;

/**
 * @author gedal
 * @version
 *
 * An abstract representation of a Vehicle that exclusively carries people.
 *
 * @see Vehicle
 */
public abstract class TransportVehicle implements Vehicle {

    /**
     * The maximum amount of people that can be carried by this object.
     */
    private int maxOccupancy;

    @Override
    public String move(){
        return "Im moving with people";
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }
}
