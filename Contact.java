package labone;

public class Contact {
    //a field to take the name
    private String name;
    // a field to take the phone Number
    private String phoneNumber;
    //a field to take the rank of holiday destination
    private int holidayDestinatio;
    //the following methods are setters and getters to the private fields
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setHolidayDestinatio(int holidayDestinatio){
        this.holidayDestinatio=holidayDestinatio;
    }
    public int getHolidayDestinatio(){
        return holidayDestinatio;
    }
}
