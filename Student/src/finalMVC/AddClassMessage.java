package finalMVC;

public class AddClassMessage extends Message {
    private String course;
    public AddClassMessage(String str) {
    this.course = str;
    }

   public String getCourse() {
    return course;
   }
}