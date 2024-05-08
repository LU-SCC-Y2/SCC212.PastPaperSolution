public class DenialofService extends AttackDetector{
    protected CyberSecurityManager manager;

    public DenialofService(CyberSecurityManager c){
        super(c);
    }

    public void processPacket(byte[] givenPacket){
        if (givenPacket == super.identificationSignature){
            attack = new CyberAttack("Denial of Service");
            attack.update(1);
        }else{
            attack.update(0);
        }
    }

}
