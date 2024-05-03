public class ItemSword implements Item{


    @Override
    public void use( Character owner, Character target){
        System.out.println(owner.getName() + "Using sword on " + target.getName());
    }
}
