public class ItemFactory {
    
    public static Item createItem(String itemName) {
        switch (itemName){
            case "Sword":
                return new ItemSword();
            default:
                throw new IllegalArgumentException("Invalid item name: " + itemName);
        }
    }
}
