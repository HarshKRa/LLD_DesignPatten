package entities;

public class UserAccount {

    private  String username;
    private  String password;

    private  UserAccount(UserAccountBuilder builder){
            this.username = builder.username;
            this.password = builder.password;
    }

    public  static  class  UserAccountBuilder{

        private final  String username;
        private final  String password;

        public UserAccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public UserAccount build(){
            return new UserAccount(this);
        }
    }
}
