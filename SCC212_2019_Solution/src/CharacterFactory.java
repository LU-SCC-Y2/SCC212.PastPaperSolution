public class CharacterFactory {

    public static Character createCharacter(String name){
        switch (name){
            case "Goblin":
                return new CharacterGoblin("Goblin", 50);
            case "Gandalf":
                return new CharacterGandalf("Gandalf", 100);
            case "Balrog":
                return new CharacterBalrog("Balrog", 100);
            default:
                return new CharacterAI("AI", 1000000);
        }
    }
}
