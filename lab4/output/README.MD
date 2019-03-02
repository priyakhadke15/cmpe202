/*The CRC diagram for Din Tai Fung Problem
  Priya Khadke (013826631)
*/

Two design patterns are used in the Din Tai Fung solution namely Observer and Chain of Responsibility.

Below entities are identified in the problem space,
1. Customer - Person/group wishing to go to Din Tai Fung restaurant
2. Waitlist - list of customer queue to enter Din Tai Fung restaurant .(Registered  customers to waitlist).
3. Waitlist Manager - Person responsible to manage(add or remove) the customers from the waitlist and notify the customers of the table availability.
4. Table - Subject in the problem domain to be occupied. 


1.Observer Pattern: 
-The subject (table) maintains the status of either occupied or available.Any change in the state of the table is observed by an Observer - Waitlist Manager.

2. Chain of Responsibility
- The waitlist manager(client) identifies the customer at the top of the waitlist and requests to occupy the table(handle the request).
- The customer  at the top of the list (handler) will verify if the table is able to accommodate the customer's party.If not the handler will notify the next customer in line (successor handler).This pattern maps to the typical "Chain of Responsibility" pattern.
- In case, the table is able to accommodate the customer party, the customer will occupy the table and the change of table state is observed by the Waitlist Manager.
