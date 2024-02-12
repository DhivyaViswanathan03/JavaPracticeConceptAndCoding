
@MyCustomAnnotation(name = "divs")
public class Main {

	public static void main(String[] args) {
		MyCustomAnnotation[] obj = new Main().getClass().getAnnotationsByType(MyCustomAnnotation.class);
		for(MyCustomAnnotation annotation:obj) {
		System.out.println(annotation);
		}
	}

}
