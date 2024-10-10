package Task_3;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }
    public ArrayList<Room> getRoom() {
        return rooms;
    }

    public void setRoom(ArrayList<Room> room) {
        this.rooms = room;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }


}
