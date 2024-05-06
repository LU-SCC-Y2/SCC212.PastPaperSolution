public class App {
    public static void main(String[] args) throws Exception {
        MagicFactory magicFactory = new MagicFactory();
        magicFactory.calculateEgg(1);

        System.out.println(magicFactory.getTotalSold());
    }
}

