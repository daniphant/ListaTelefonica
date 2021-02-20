
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ContactList {
    
    static final String CONTACTS_FILE_PATH = "listaTelefonica.txt";
    ArrayList<Contact> registeredContacts;
    
    public ContactList() {
        registeredContacts = new ArrayList<Contact>();
        fetch();
    }
    
    private void fetch() {        
        try {
          File contactListTxtFile = new File(CONTACTS_FILE_PATH);
          Scanner textReader = new Scanner(contactListTxtFile);
          
          while (textReader.hasNextLine()) {
            String data = textReader.nextLine();
            
            registeredContacts.add(
                new Contact(data.split(",")[0], data.split(",")[1])
            );
            
            MenuPrincipal.addRow(registeredContacts.get(registeredContacts.size() - 1));
          }
          
          textReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fetchByParameters(String searchParameters) {                
        MenuPrincipal.clearRows();  

        if(searchParameters.contains(" ")) 
            sort(searchParameters);
        
        else sortByParts(searchParameters);
    }
    
    private void sort(String searchParameters) {
        for(Contact contact : registeredContacts) {
            System.out.println(contact.getName().startsWith(searchParameters));
            System.out.println(contact.getPhoneNumber().startsWith(searchParameters));
            
            if(contact.getName().startsWith(searchParameters) || contact.getPhoneNumber().startsWith(searchParameters))
                MenuPrincipal.addRow(contact);
        }
    }
    
    private void sortByParts(String searchParameters) {
        String[] dividedName;
        String[] dividedPhone;
        boolean isFoundInName = false;
        
        for(Contact contact : registeredContacts) {
            dividedName = contact.getName().split(" ");
            for(String namePart : dividedName) 
                    if(namePart.startsWith(searchParameters)) {                            
                        MenuPrincipal.addRow(contact);
                        isFoundInName = true;
                        break;
                    }
            
            if(!isFoundInName) {
                dividedPhone = contact.getPhoneNumber().split(" ");
                    for(String phonePart : dividedPhone) 
                        if(phonePart.startsWith(searchParameters)) {
                            MenuPrincipal.addRow(contact);
                            break;
                        }
            }

        }
    }
    
    public void add(Contact newContact) {
        registeredContacts.add(newContact);
        MenuPrincipal.addRow(newContact);
        
        try {
            Files.write(
                    Paths.get(System.getProperty("user.dir") + "\\" +  CONTACTS_FILE_PATH), 
                    (newContact.getName() + "," + newContact.getPhoneNumber()).getBytes(),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("Falha ao escrever uma nova linha no arquivo.");
        }
    }
        
    public void reset() {
        registeredContacts.removeAll(registeredContacts);
        MenuPrincipal.clearRows();
        fetch();
    }
    
}
