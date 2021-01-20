package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapactiy = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "kulutamamsi.com";



    // Constructor to receive the first name and last name

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;



        // Call a method asking for the department => then return the department

        this.department = setDepartment();



        // Call a method that returns a RANDOM PASSWORD

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);



        // Combine elements to generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }


    // Ask for the department

    public String setDepartment(){

        System.out.print("New worker: " + firstName +  ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for Finance\nEnter the department code:");
        Scanner keyboard  = new Scanner(System.in);

        int depChoice = keyboard.nextInt();

        if(depChoice == 1){
            return "sales";
        }
        else if(depChoice == 2){
            return "development";
        }
        else if(depChoice == 3){
            return "accounting";
        }else{
            return "finance";
        }
    }




    //Generate a random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // Set the mailbox capacity (Encapsulation accessing the private elemnt using public constructors

    public void setMailboxCapacity(int capacity){
        this.mailboxCapactiy = capacity;
    }


    // Set the alternate email (not necessary)

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapactiy(){
        return mailboxCapactiy;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPasword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapactiy + "mb" + "\n" +
                "SPIRIT ANIMAL: OCTOPUS";
    }



}

