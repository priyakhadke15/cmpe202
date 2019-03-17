/*The Five Guys Design Pattern (used Starter code : Counter Burger)
  Priya Khadke (013826631)
*/

Overall three design patterns are used in the Five Guys design solution namely Composite, Strategy and decorator.

Below entities are identified which can be part of the order (This includes items with actual price and belongs to either of the below categories)
1. Custom Burger - includes burger,patty,toppings
2. Sides - includes fries,milkshakes,etc.


1.Composite Pattern: (already included in starter code)
 - The order root includes custom burger and sides.Each item in turn include burger,patty,toppings and fries respectively. The action of printing description (printdescription() ) is common to these classes.Each component performs the actions by calling leaf's operation.

2. Strategy Pattern
- Two receipts are required to be printed - customer copy with prices and the packing receipt with sequence of toppings.
- Since the order items for both receipts are same but the format of receipt is different. Strategy pattern can be used to determine which receipt should be printed.

