package dal;

/**
 * Singleton, so that only one instance/object can be created
 */
public class UserDatabase {

    private static  UserDatabase instance;

    private  UserDatabase(){
        // Makes the constructor as private // no one allow to call the new object
    }

    public static synchronized UserDatabase getInstance(){

        // But one problem if two threads call same time may will it create two object, so we have to synchronized the method
        if(instance == null){
            instance =  new  UserDatabase();  // our constructor is private, so we can make new object inside the class
                                            // but we are make one object when instance is null otherWise we will use same instance
        }
        return  instance;
    }

}
