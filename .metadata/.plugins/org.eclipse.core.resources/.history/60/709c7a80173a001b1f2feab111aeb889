package finalMVC;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    public static void main(String[] args) {
      
      BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
 
      StudentModel model = new StudentModel();
      View view = new View(queue, model.name, model.classes);
      Controller controller = new Controller(queue, model, view);
      controller.mainLoop();
    }
}
