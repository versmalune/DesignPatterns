package decorator02;

public class LuxuryCar extends CarDecorator{
	
	public LuxuryCar(Car model) {
		super(model);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Adding features of Luxury Car.");
	}

}
