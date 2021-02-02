package Samples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerA {

    private ModelA model;
    private ViewA view;
    private ActionListener actionListener;
    
    public ControllerA(ModelA model, ViewA view){
        this.model = model;
        this.view = view;
                          
    }
    
    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {                  
                  linkBtnAndLabel();
              }
        };                
        view.getButton().addActionListener(actionListener);   
    }
    
    private void linkBtnAndLabel(){
        model.incX();                
        view.setText(Integer.toString(model.getX()));
    }    
}