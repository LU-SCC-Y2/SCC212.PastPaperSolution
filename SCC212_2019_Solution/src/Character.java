import java.util.ArrayList;

public abstract class Character {
    private String name;
    private float health;
    private ArrayList<Item> items;

    public Character(String name, float health) {
        this.name = name;
        this.health = health;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void reduceHealth(int damage){
        this.health -= damage;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }

}
