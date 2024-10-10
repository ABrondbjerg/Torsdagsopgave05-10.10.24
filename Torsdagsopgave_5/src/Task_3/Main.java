package Task_3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(3, 3);
        Room room2 = new Room(5, 2);
        Room room3 = new Room(1, 7);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 3);
        Building building2 = new Building(rooms, 1);

        System.out.println(countLampsInBuilding(building1));
        System.out.println(countRoomsInBuilding(building1));
        System.out.println(countWindowsInBuilding(building1));
        System.out.println("Is building normal? " + isNormal(building1));
        System.out.println("Is building normal? " + isNormal(building2));

    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRoom()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;

    }

    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRoom()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building building) {
        return building.getRoom().size();

    }
   static boolean isNormal(Building building) {
        if(building.getNumberOfFloors() >= countRoomsInBuilding(building)){
            return true;
        }else{
            return false;
        }
    }
}
