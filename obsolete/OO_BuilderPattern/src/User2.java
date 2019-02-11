/**
 * Builder pattern is useful, when we have many arguments to initialize the
 * object.
 * 
 * @author rosachde
 *
 * Confusing way
 *
 */
public class User2 {
    // Required
    private String userName;
    private String emailAddress;

    // Optional
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;

    private User2() {
    }

    public class UserBuilder {

        public UserBuilder(String uName, String eAddress) {
            userName = uName;
            emailAddress = eAddress;
        }

        public UserBuilder firstName(String fName) {
            firstName = fName;
            return this;
        }

        public UserBuilder lastName(String lName) {
            lastName = lName;
            return this;
        }

        public UserBuilder phoneNumber(int pNumber) {
            phoneNumber = pNumber;
            return this;
        }

        public UserBuilder address(String addr) {
            address = addr;
            return this;
        }

        public User2 build() {
            return  User2.this;
        }
    }

    public static UserBuilder getBuilder(String uName, String eAddress) {
        return new User2().new UserBuilder(uName, eAddress);
    }

    @Override
    public String toString() {
        return "User2 [userName=" + userName + ", emailAddress=" + emailAddress + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
                + phoneNumber + ", address=" + address + "]";
    }
}
