
import java.util.Scanner;


public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String email;
    private String alternateEmail;
    private String companySuffix = "company.com";
    
    //Constructor to receive firstName and lastName
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
        
        //Call a method asking for department
        this.department = setDepartment();
        //System.out.println("Department: "+ department);
        
        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+password);
        
        //Combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Your email is: "+email);
    }
    //Determine department
    private String setDepartment(){
        System.out.print("New Worker: "+firstName+" DEPARTMENT CODES: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nENTER DEPARTMENT CODE: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice) {
            case 1:
                return "sales";
            case 2: 
                return "dev";
            case 3:
                return "acct";
            default:
                return "";
        }
    }
    //Generate a random String for password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0;i<password.length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);                   
        }
    return new String(password);
    }
    //Change password
    public void changePassword(String newPassword){
        this.password = newPassword;
    }
    //Set mailboxCapacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //Set alternateEmail
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //Get constructors
    public int getMailBoxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }
    //Display contents
    public String displayInfo(){
        return "NAME: "+firstName+" "+lastName+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
    }
    
}
