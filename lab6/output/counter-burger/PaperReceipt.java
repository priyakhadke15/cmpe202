
public class PaperReceipt implements ReceiptStrategy {

	public Component getOrder() {
		Composite order = new CompositePaperReceipt("FIVE GUYS");
		CustomBurger customBurger = new CustomBurgerPaperReceipt("Build Your Own Burger");

		Burger b = new Burger("Burger Options");
		String[] bo = { "littlebaconburger" };
		b.setOptions(bo);

		Patty p = new Patty("Patty Options");
		String[] po = { "Bacon" };
		p.setOptions(po);
		p.wrapDecorator(b);

		// toppings free
		Toppings t = new Toppings("Toppings Options");
		String[] to = { "Lettuce", "Tomatoes", "Grilled Onions", "Jalapeno Peppers" };
		String[] where = { "onTop", "onTop", "onMeat", "onMeat" };

		t.setOptions(to, where);
		// Setup Custom Burger Ingredients
		t.wrapDecorator(p);
		customBurger.setDecorator(t);
		customBurger.addChild(b);
		customBurger.addChild(p);
		customBurger.addChild(t);

		Sides sides = new SidesPaperReceipt("Choose Your Sides");
		Fries fries = new Fries("Fries Options");
		String[] fo = { "Little Fries Cajun" };
		fries.setOptions(fo);
		sides.setDecorator(fries);
		sides.addChild(fries);

		// Add Custom Burger to the Order
		order.setDecorator(t);
		order.addChild((Component) customBurger);
		order.addChild((Component) sides);

		return order;
	}

	public void printDescription() {
		// TODO Auto-generated method stub

	}

}
