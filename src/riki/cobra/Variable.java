package riki.cobra;

public class Variable<T> {
	private T value;	
	
	public Variable(T value) {
		this.value = value;
	}
	
	@SuppressWarnings("unchecked")
	public Class<T> getType() {		
		return (Class<T>)value.getClass();
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
