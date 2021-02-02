class KillerWhale extends Whale {
    // Removing super keyword here
	
    KillerWhale(String s){
    	super(s);
    }
	
    public void printColor() {
        System.out.println(getColor());
    }
    
    public static void main(String[] args) 
    {
    	KillerWhale whale = new KillerWhale("Hey");
    	whale.printColor();
    }
}