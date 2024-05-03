import java.util.HashMap;
import java.util.Map;

public class Game {
    private static Map<String, Character> characters = new HashMap<>();

    public static void addCharacter(Character character){
        characters.put(character.getName(), character);
    }

    public static Character findName(String name){
        return characters.get(name);
    }

    public static void dealDamage(int damage){
        for (Character c: characters.values()){
            if (!(c instanceof CharacterAI)){
                c.reduceHealth(damage);
            }
        }
    }
}
