package patterns;

public class Demo {
	
	public static void main(String[] args) {
		
		NameRepo nameRepo = new NameRepo();
		
		for(Iterator i = nameRepo.getIterator(); i.hasNext();) {
			String name = (String)i.next();
			System.out.println("Name: " + name);
		}

	}

}
