package factory;

public class HelloWorldDecoupled {

	public static void main(String[] args) {
		MessageProvider provider = new HelloWorldMessageProvider();
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider);
		renderer.render();
		System.out.println(renderer.getClass());
	}

}
