import java.util.*;

import Entity.Character.Character;
import Entity.Character.Sons.Dog;
import Entity.Character.Sons.Human;

public class main {
  
    Character c1 = new Human(3, 2, 4, 6, "Jhonny", 30, 50); // ha 30 monete, 50 hp

    Plantation p1 = new Plantation("Plantation beta", 4, "carrots"); // 4 x 4 piantagione
    Plantation p2 = new Plantation("Plantation gamma", 5, "potatoes"); // 5 x 5 piantagione

    Monster m1 = new Spider(1, 1, 2, 2, "Spider", 10, 2); // 10 hp, 2 attack
    
    Character f1 = new Dog(2, 3, 3, 4, "willie", 5, 1); // 5 hp, 1 attack

    // Character is the father of Human and Dog
    // Monster is the father of Spider
    //they are both sons to Entity.java
    
    

}
