package finalMVC;

public class NewNameMessage extends Message {
    String name;

    public NewNameMessage (String str) { this.name = str; }

    public String getName() {
        return name;	
    }
}