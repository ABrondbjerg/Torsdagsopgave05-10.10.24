package Task_1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "\n" + "Customer: " + "\n" +
                "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "userName = " + userName + "\n" +
                "id = " + id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
