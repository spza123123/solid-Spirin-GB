package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        //user.report();
        user.save();
        Reporter reporter = new Reporter(user.getName());
        reporter.report();
        
    }
}