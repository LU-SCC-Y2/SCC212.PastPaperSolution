public class DemiGorgonVirus extends AttackDetector{
    private final byte[] packet = {5, 1, 13};

    public DemiGorgonVirus(CyberSecurityManager c){
        super(c);
    }

    public void processPacket(byte[] givenPacket){
        int intensity = super.countOccurence(packet, givenPacket);

        if (intensity > 0){
            attack = new CyberAttack("DemiGorgon Virus");
            manager.alert(attack);
            attack.update(intensity);
        }else{
            attack.update(0);
        }
    }


}