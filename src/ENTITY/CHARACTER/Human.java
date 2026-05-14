package Entity.Character.Sons;
public class Human extends Character {

    protected Set<Dog> dogs;

    public Human(double x, double y, double width, double height, String name, int hp, int coins) {
        super(x, y, width, height, name, hp, coins);
        this.dogs = new HashSet<>();
    }

    @Override
    public void update() {
        // Implement human-specific update logic here
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    @Override
    public void draw(GraphicsContext gc) {
        // Implement human-specific drawing logic here
    }
    
}