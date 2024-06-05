package homework;

public class Reporter {
     private String name;

    public Reporter(String name) {
        this.name = name;

    }
    public void report(){
        System.out.println("Report for user: " + name);
    }

}
