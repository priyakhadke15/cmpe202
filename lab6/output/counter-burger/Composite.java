import java.util.ArrayList;

public abstract class Composite implements Component {

	protected ArrayList<Component> components = new ArrayList<Component>();
	protected String description;
	PriceDecorator decorator = null;

	public Composite(String d) {
		description = d;
	}

	public void setDecorator(PriceDecorator p) {
		this.decorator = p;
	}

	public abstract void printDescription();

	public void addChild(Component c) {
		components.add(c);
	}

	public void removeChild(Component c) {
		components.remove(c);
	}

	public Component getChild(int i) {
		return components.get(i);
	}

}
