Assignemnt 4

This project demonstrates the Bridge Design Pattern in Java using the example of geometric shapes (Circle, Square) and different colors (White, Blue).

The Bridge Pattern is used to separate abstraction from its implementation, so they can vary independently. This design allows combining different shapes and colors without creating an explosion of subclasses.


 Structure

 **Color (Interface)** – defines the behavior for applying color.
 **RedColor / BlueColor (Concrete Implementations)** – specific color implementations.
 **Shape (Abstract class)** – abstraction for geometric figures.
 **Circle / Square (Refined Abstractions)** – concrete shapes that can use any color.
 **Main (Client)** – demonstrates the pattern in action.


##  output:

```
Circle filled with:
white
Square filled with:
blue
```
