public class App {

    public static void main(String[] args) {

        User u1 = new User.UserBuilder("rosachde", "rohan.sachdeva@aricent.com").build();
        System.out.println(u1);
        
        User2 u2 = User2.getBuilder("rasachde", "rajat.sachdeva@aricent.com").firstName("rajat").build();
        System.out.println(u2);
        
    }

}
