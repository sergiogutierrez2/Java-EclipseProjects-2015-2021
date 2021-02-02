package finalMVC;

import java.util.ArrayList;

public class StudentModel {
    String name = "default name";
    ArrayList<String> classes = new ArrayList<>();

    public void setName(String name) {
    if (name.length() > 0) {
         this.name = name;
      }
   }

   public void addClass(String name) {
        this.classes.add(name);
   }
}