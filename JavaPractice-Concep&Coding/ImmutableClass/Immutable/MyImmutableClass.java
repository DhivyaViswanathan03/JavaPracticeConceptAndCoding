package Immutable;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {
	
	private final String course;
	private final List<String> namesList;
	
	public MyImmutableClass(String course, List<String> namesList) {
		this.course = course;
		this.namesList = namesList;
	}
	public String getCourse() {
		return course;
	}
	
	public List<String> getNamesList() {
		return new ArrayList(namesList);
	}
	
	@Override
	public String toString() {
		return "MyImmutableClass [course=" + course + ", namesList=" + namesList + "]";
	}
	
	
	

}
