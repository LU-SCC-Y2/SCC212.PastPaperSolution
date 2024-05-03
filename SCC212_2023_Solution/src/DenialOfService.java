public class DenialOfService extends AttackDetector{
    private byte[] previousPacket;

    public DenialOfService(CyberSecurityManager c) {
        super(c);
        previousPacket = null;
    }

    public void processPacket(byte[] givenPacket){
        if (super.isPreviousPacketEqual(previousPacket, givenPacket)){
            attack = new CyberAttack("Denial of Service");
            manager.alert(attack);
            attack.update(1);
        } else{
            attack.update(0);
        }
        previousPacket = givenPacket.clone();
    }

    

    
}
