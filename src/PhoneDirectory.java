import java.util.ArrayList;

public class PhoneDirectory {
    private ArrayList<Contact> contactList = new ArrayList<>();

    public void add(String name, String phone){
        contactList.add(new Contact(name, phone));
    };

    public void get(String name){
        System.out.println("Contact " + name + ":");
        for(Contact contact : contactList){
            if(contact.getName().equals(name)){
                System.out.println(contact.getPhone());
            }
        }
        System.out.println();
    }

    public void showAllContacts(){
        for(Contact contact : contactList){
            System.out.println("Contact - " + contact.getName() + ", phone - " + contact.getPhone());
        }
        System.out.println();
    }
}
