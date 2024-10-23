package Immutable;

public class Address {
	private String city;
	

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	

}
