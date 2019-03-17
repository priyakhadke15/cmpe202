
public class PackingReceipt implements ReceiptStrategy {

	public Component getOrder() {
		Composite order = new CompositePackingReceipt("FIVE GUYS");
		CustomBurger customBurger = new CustomBurgerPackingReceipt("Build Your Own Burger");

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

		// Packing Receipt
		String[] packto = new String[to.length];
		for (int i = 0; i < where.length; i++) {
			if ("onTop".equals(where[i])) {
				packto[i] = to[i];
			}
		}
		for (int i = 0; i < where.length; i++) {
			if ("onMeat".equals(where[i])) {
				packto[i] = to[i];
			}
		}
		for (int i = 0; i < where.length; i++) {
			if ("onDown".equals(where[i])) {
				packto[i] = to[i];
			}
		}
		t.setOptions(packto, where);
		t.wrapDecorator(p);
		customBurger.setDecorator(t);
		customBurger.addChild(b);
		customBurger.addChild(t);
		customBurger.addChild(p);

		Sides sides = new SidesPackingReceipt("Choose Your Sides");
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
