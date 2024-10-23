package Immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

final class MyImmutableClass implements Cloneable{
	
	private final String course;
	private final List<String> namesList;
	private final Date date;
	private final Address address;
	
	public MyImmutableClass(String course, List<String> namesList
			,Address address,Date date) {
		this.course = course;
		this.namesList = namesList;
		this.date = date;
		this.address = address;
	}
	
	public Date getDate() {
		//return (Date) date.clone();
		return new Date();
	}
	public Address getAddress() {
		return new Address(address.getCity());
	}
	public String getCourse() {
		return course;
	}
	public List<String> getNamesList() {
//		String.valueOf(false);
		return new ArrayList();
	}
	
	@Override
	public String toString() {
		return "MyImmutableClass [course=" + course + ", "
				+ "namesList=" + namesList + ", date=" 
				+ date + ", address="+ address + "]";
	}
	
	

}
