
package labone;

//These imports are required as they include the fuctionalities of the Contacts and Contacts Manager classes
import java.util.Scanner;
import labone.Contact;
import labone.ContactManager;
public class Input {
Input(){
    
    //Code initialization
    String searchname;
    
    //This line calls a new instance of ContactManager.class
    ContactManager contactManager = new ContactManager();
    
    //Getting ready to receive the input
    Scanner scanner= new Scanner(System.in);
    
    //Counter control loop to receive the inputs up to 20
    while (contactManager.getContactsCount() != 20) {
        
        //Getting name
        System.out.println("please++ enter the name of the contact");
        String name=scanner.next();
        
        //Sentinel control loop to break the while loop when the user inputs z
        if(name.equalsIgnoreCase("z")){
            break;
        }
        
        //Getting phone number
        System.out.println("please enter the your phone number");
        String phoneNumber=scanner.next();
        
        //Getting holiday destination raking
        System.out.println("please enter the name of your destination");
        int ranked=scanner.nextInt();

        
        //Storing the received inputs in Contact.class as objects
        Contact adding=new Contact();
        adding.setName(name);
        adding.setPhoneNumber(phoneNumber);
        adding.setHolidayDestinatio(ranked);
        contactManager.addContact(adding);
        // contactManager.
    }
    
    //After receiving all inputs, this line will ask for the contact you want to read information on
    System.out.println("please enter the name you want to search detail about");
    searchname=scanner.next();
    
    //Searching the name.. searchContact() is a method in ContactManager.class used to search for the name
    Contact searced=contactManager.searchContact(searchname);
    
    if(searced!=null){
    System.out.println("please enter to choose what happens\n1.searched name number \n2.searched name destination");
    int enter=scanner.nextInt();
    switch (enter){
        case 1:System.out.println(searced.getPhoneNumber());break;
        case 2:System.out.println(searced.getHolidayDestinatio());break;
        default:System.out.println("invalid argument");
            
    }
    } else{
        
    }
    contactManager.printingFull();
    int most=contactManager.frequentNumber();
    System.out.println(most);
}
}