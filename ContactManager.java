package labone;
import labone.Contact;

import java.util.Collections;
public class ContactManager {
    // an array of the Contact class used as a field in this class
    private Contact[] contacts;
    //counts the mumber of class object being added to the array contact
    private int contactsCount;
    //the constructor set the contact array to only take 20 elements as specified by the lecturer and also initialise the contactsCount to 0
    ContactManager(){
        this.contacts=new Contact[20];
        this.contactsCount=0;
    }
    //the addcontact add a contact that will be specified in the main method to the field that has been declared here
    public void addContact(Contact contacts){
this.contacts[contactsCount]=contacts;
contactsCount++;
    }

        public int getContactsCount(){
        return contactsCount;
        }
        //returns the contact that has the name as the name typed by the user
    Contact searchContact(String searchName){
        for(int i=0;i<contactsCount;i++){
            if(contacts[i].getName().equals(searchName)){

                return contacts[i];
            }
        }
        return null;
    }
    //returns the summary of the contact list as the lecturere is specifying. I dont know why he is taking that but it is working by the way
    public void printingFull(){
        for(int i=0;i<contactsCount;i++){
            System.out.println(contacts[i].getName()+" "+contacts[i].getPhoneNumber()+" "+contacts[i].getHolidayDestinatio());
        }
    }
   public int frequentNumber(){
        int mostmatches=0;
       for(int i=0;i<contactsCount;i++){
           int matches=0;
          try{
            for (Contact mcontact:contacts){
               if(contacts[i].getHolidayDestinatio()==mcontact.getHolidayDestinatio()){
                    matches++;
               }
            }  
          } catch(NullPointerException e){
              
          }
          
            if(matches>mostmatches)
                mostmatches=matches;
        }
        return mostmatches;
   }
}
