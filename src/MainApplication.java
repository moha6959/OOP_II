import javax.sql.DataSource;

public class MainApplication {
    public static void main(String[] args){
        Admin curAdmin=new Admin(1234,"Stephen","xa1@LW42%3");
        User curUser=new User(4455,"John");
        curAdmin.performOperation((DataSource) new Update());
        curUser.performOperation((DataSource) new View());
    }
}
