package patterns;

public class NameRepo implements Container {
	public String names[] = {"A", "B", "C"};
	
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		int index;
		public boolean hasNext() {
			if(index < names.length) {
				return true;
			}
			return false;
		}
		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
