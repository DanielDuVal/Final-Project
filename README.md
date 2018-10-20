# Final-Project


My project is a POS system for a fast food restaurant. As items are ordered, corresponding objects are created. 
If a topping is added, the decorator pattern will modify the object to include the topping and adjust the name
and price accordingly. As menu items are created, they are stored in an arraylist. Items in the arraylist are
accessed by the update method in the observer pattern. Additionally, if fries are ordered, the command pattern
can be used to operate the fryers.

Patterns:

Factory
Decorator
Observer
Command

I separated each pattern by package:

- The Factory pattern can be found in the 'orderingSystem' package.
- The Decorator pattern can be found in the 'itemBuilder' package.
- The Observer pattern can be found in the 'display' package.
- The Command pattern can be found in the 'fryer' package.

