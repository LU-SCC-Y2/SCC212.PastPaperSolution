public class App {
    public static void main(String[] args) {

        // Question 1b. 
        Character Gandalf = CharacterFactory.createCharacter("Gandalf");
        Character Balorg = CharacterFactory.createCharacter("Balorg");
        Game.addCharacter(Gandalf);
        Game.addCharacter(Balorg);

        //Question 1c. 
        Item sword = ItemFactory.createItem("Sword");
        Gandalf.addItem(sword);
        sword.use(Gandalf, Balorg);

        //Question 1d. 
        Character AI = CharacterFactory.createCharacter("AI");
        Game.dealDamage(10);

        //Question 1e. 
        // I can add an instanceof function to check if the character is an instance 
        // of a CharacterAI. If not, then damage will be dealt. It can be changed 
        // in the Game Class.  

        // if (!(c instanceof CharacterAI)){
        //     c.reduceHealth(damage);
        // }

    }
}
