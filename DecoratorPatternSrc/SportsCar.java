package decorator02;

public class SportsCar extends CarDecorator{
	
	public SportsCar(Car model) {
		super(model);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Adding features of Sports Car.");
	}

}
