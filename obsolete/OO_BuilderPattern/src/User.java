/**
 * Builder pattern is useful, when we have many arguments to initialize the
 * object.
 * 
 * @author rosachde
 *
 */

public class User {

    // Required
    private String userName;
    private String emailAddress;

    // Optional
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;

    // Telescoping Constructor - When we have multiple constructor to create an
    // object.
    /*
     * public User(String userName, String emailAddress) { this.userName =
     * userName; this.emailAddress = emailAddress; }
     * 
     * public User(String userName, String emailAddress, String firstName,
     * String lastName) { this.userName = userName; this.emailAddress =
     * emailAddress; this.firstName = firstName; this.lastName = lastName; }
     */

    private User(UserBuilder userBuilder) {
        this.userName = userBuilder.userName;
        this.emailAddress = userBuilder.emailAddress;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.phoneNumber = userBuilder.phoneNumber;
        this.address = userBuilder.address;
    }

    public static class UserBuilder {
        // Required
        private String userName;
        private String emailAddress;

        // Optional
        private String firstName;
        private String lastName;
        private int phoneNumber;
        private String address;

        public UserBuilder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", emailAddress=" + emailAddress + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
                + phoneNumber + ", address=" + address + "]";
    }

}
