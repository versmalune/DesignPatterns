package decorator02;

public class CarDecorator implements Car{
	protected Car car;
	
	public CarDecorator(Car model) {
		this.car = model;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}

}
