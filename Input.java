package labone;

import java.util.Scanner;
import labone.ContactManager;
import labone.Contact;
public class Input {
Input(){
    String searchname;
    ContactManager contactManager = new ContactManager();
    Scanner scanner= new Scanner(System.in);
    while (contactManager.getContactsCount() != 20) {
        System.out.println("please++ enter the name of the contact");
        String name=scanner.next();
        if(name.equalsIgnoreCase("z")){
            break;
        }
        System.out.println("please enter the your phone number");
        String phoneNumber=scanner.next();
        System.out.println("please enter the name of your destination");
        int ranked=scanner.nextInt();

        Contact adding=new Contact();
        adding.setName(name);
        adding.setPhoneNumber(phoneNumber);
        adding.setHolidayDestinatio(ranked);
        contactManager.addContact(adding);
        // contactManager.
    }
    System.out.println("please enter the name you want to search detail about");
    searchname=scanner.next();
    Contact searced=contactManager.searchContact(searchname);
    System.out.println("please enter to choose what hapFrapens\n1.searched name number \n2.searched name destination");
    int enter=scanner.nextInt();
    switch (enter){
        case 1:System.out.println(searced.getPhoneNumber());break;
        case 2:System.out.println(searced.getHolidayDestinatio());break;
        default:System.out.println("invalid argument");break;}
    contactManager.printingFull();
    int most=contactManager.frequentNumber();
    System.out.println(most);
}
}