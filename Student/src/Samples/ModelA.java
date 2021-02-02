package Samples;

public class ModelA {
    
    private int x;
    
    public ModelA(){
        x = 0;
    }
    
    public ModelA(int x){
        this.x = x;
    }
    
    public void incX(){
        x++;
    }
    
    public int getX(){
        return x;
    }
}