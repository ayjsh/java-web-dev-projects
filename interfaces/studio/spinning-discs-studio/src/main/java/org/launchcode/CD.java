package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    private  String genre;

    private int numTracks;

    private int minRPM=200;

    private int maxRPM=500;

    public static final int maxCapacity = 700;

    public CD(String name, String contents, int capacity, String type, int storedCapacity, String genre, int numTracks) {
        super(name, contents, capacity, type, storedCapacity);
        this.genre = genre;
        this.numTracks = numTracks;
    }

    @Override
    public void play(){

    }

    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of"+minRPM+"-"+maxRPM+"rpm.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
