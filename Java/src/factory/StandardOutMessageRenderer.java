package factory;

public class StandardOutMessageRenderer implements MessageRenderer {

	MessageProvider provider;

	@Override
	public void render() {

		if(provider==null){
			throw new RuntimeException("You must set the property messageProvider before rendering "
					+ StandardOutMessageRenderer.class.getName() );
		}
		else{
			System.out.println(provider.getMessage());
		}

	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider=provider;

	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.provider;
	}

}
