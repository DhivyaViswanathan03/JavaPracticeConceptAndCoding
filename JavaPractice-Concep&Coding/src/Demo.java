class A {
	int eid;
}

public class Demo {

	public static void main(String[] args) {
		A a = new A();
		a.eid = 10;
		A a1=new A();
		a1.eid=11;
		System.out.println(a1.eid);
		System.out.println(a.eid);
	}

}
