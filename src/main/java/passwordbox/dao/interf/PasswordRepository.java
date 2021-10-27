package passwordbox.dao.interf;

import passwordbox.model.Password;
import passwordbox.model.User;
import java.sql.ResultSet;
import java.util.ArrayList;

public abstract interface PasswordRepository {
    
/**
 * This method registers a new user to the password database.
 * Afterwards it will be possible to save, edit and delete passwords for this user.
 * @param user an instance of the User class which will be created based on the information provided by the user when registering
 */
    public abstract void register (User user);
    
    /**
     * The login method returns the password which the user provided when registering to the application.
     * @param username String object which is entered by the user when attempting to login to the application
     * @return: the password returned will be checked against the password entered by the user and if they match, user will be granted access
     */
    public abstract String login (String username);
    
    /**
     * This method checks whether the username that has been entered at login exists or not.
     * @param username String object which is entered by the user when attempting to login to the application
     * @return true or false depending on whether the username does exist or not
     */
    public abstract boolean usernameCheck (String username);
    
    /**
     * The user ID is necessary to call the constructor of SelectOption GUI of the application.
     * @param username String object which is entered by the user when attempting to login to the application
     * @return String userId will be returned
     */
   public abstract int retrieveUserId (String username);
    
    /**
     * The method inserts a new Password object to the database.
     * @param pw A Password object that is created based on the data provided by the user
     */
   public abstract void insert(Password pw);
    
    /**
     * The method deletes the data with the specified id from the database.
     * @param id Password ID provided by the user
     */
    public abstract void delete(String id);
    
    /**
     * The method is used to list all the passwords which have been saved by the user previously.
     * @param userId ID of the user for whom the passwords will be listed
     * @return List of String array will be displayed as list of the passwords
     */
    public abstract ArrayList<String[]> listAll (int userId) ;
    
    /**
     * The method returns a Password object which will be edited. To return the selected Password object the makeOnePassword method will be used
     * @param passwordId Selected by the user by highlighting the row in the list of all passwords
     * @return Password object is returned
     */
    public abstract Password findById(int passwordId);

    /**
     * The method returns the value of language column for the specified userId. 
     * @param userId The user who is logged in to the application
     * @return String object for language value
     */ 
    public abstract String findLanguage (int userId);
    
    /**
     * The method creates a Password objects and returns this based on the ResultSet object received as a parameter.
     * @param rs ResultSet object created in the calling method (e.g. findById)
     * @return Password object is returned
     */
    public abstract Password makeOnePassword (ResultSet rs);

    /**
     * The method is used to update the password which has been selected by the user previously.
     * @param pw The Password object contains the attributes of the updated object 
     * @param passwordId The ID of the password to be updated
     */
    public abstract void update(Password pw, int passwordId);

}
