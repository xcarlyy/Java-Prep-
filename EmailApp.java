//Carly Xie
//The Ultimate Java Prep Guide- Project1
//6/21/18

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("Carly","X");
        System.out.println(email.displayInfo());
        email.changePassword("asdf!@#$%");
        System.out.println("Changed password: "+email.getPassword());
        
    }
    
}
