package Main.java;

public abstract class TransportVehicle implements Vehicle {

    private int maxOccupancy;

    @Override
    public void move(){
        System.out.println("Im moving with people");
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }
}
