package org.launchcode;

public abstract class BaseDisc {

    public String name;

    public String contents;

    public int capacity;

    public String type;

    public int storedCapacity;

    public BaseDisc(String name, String contents, int capacity, String type, int storedCapacity) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.type = type;
        this.storedCapacity = storedCapacity;
    }

    public void storeData(int dataSize){
        int remainingCapacity = capacity - storedCapacity;
        if(dataSize < remainingCapacity){
            System.out.println("Storage successful");
        } else {
            System.out.println("Oops!! Data size "+dataSize +" is greater than storage capacity");
        }
    }

    public void writeData(int dataSize, String contents){
        int remainingCapacity = capacity - storedCapacity;
        if(dataSize < remainingCapacity){
            this.contents += contents;
            System.out.println("Contents: "+ contents);
        } else {
            System.out.println("Unable to write contents");
        }
    }
    public void play() {

    }
}