
package classes;

public class Contact {
    private String name,surname,phoneNumber,relationship;
   
    
    public Contact(String name,String surname,String phoneNumber,String relationship){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.relationship = relationship;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getRelationship(){
        return relationship;
    }
    
    public String ToString(){
        return relationship+" --->  NAME: "+name + "  ,  " + "SURNAME: "+surname + "  ,  " +"PHONE NUMBER: "+phoneNumber;
    }
    
    
}
