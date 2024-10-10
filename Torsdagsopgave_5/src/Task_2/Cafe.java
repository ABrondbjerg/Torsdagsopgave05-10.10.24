package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
    public Cafe() {
        coffeeMenu = new ArrayList<>(); // Initialiserer ArrayList
    }
    public void loadMenuData(){
        try {
                File file = new File("coffees.txt");
                Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                    coffeeMenu.add(fileReader.nextLine());
                }
            } catch (FileNotFoundException e) {
           System.out.println("File not found");
           }
       }


    }
