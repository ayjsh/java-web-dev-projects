package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    public static final int maxCapacity = 4700;

    private String category;

    boolean isMovie;

    private int minRPM=570;

    private int maxRPM=1600;

    public DVD(String name, String contents, int capacity, String type, int storedCapacity, String category, boolean isMovie) {
        super(name, contents, capacity, type, storedCapacity);
        this.category = category;
        this.isMovie = isMovie;
    }



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void play(){

    }
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of"+minRPM+"-"+maxRPM+"rpm.");
    }
}