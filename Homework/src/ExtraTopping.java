
public class ExtraTopping implements PokeBowl {

	protected PokeBowl bowl;
	String s;
	
	public ExtraTopping(PokeBowl b, String s){
		this.bowl=b;
		this.s = s;
	}
	
	@Override
	public double getPrice() {
		return this.bowl.getPrice() + 2.5;
	}

	@Override
	public String getDescription() {
		return this.bowl.getDescription() + " + extra " + s;
	}

}
