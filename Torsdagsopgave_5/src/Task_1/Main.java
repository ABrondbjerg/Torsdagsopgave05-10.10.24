package Task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("John", "booth", "JDB"));
        customers.add(new Customer("Jane", "Dude", "JDD"));
        customers.add(new Customer("Bob", "Bob", "BBO"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customers);
        }
    }
}
