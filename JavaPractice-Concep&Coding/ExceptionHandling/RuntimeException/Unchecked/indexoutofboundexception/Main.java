package RuntimeException.Unchecked.indexoutofboundexception;

public class Main {

	public static void main(String[] args) {
		int[] a1=new int[2];
		//ArrayIndexOutofBoundException
		//System.out.println(a1[3]);
		
		//StringIndexOutOfBoundException
		String a="hello";
		System.out.println(a.charAt(10));

	}

}
