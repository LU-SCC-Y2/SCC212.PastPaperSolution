public abstract class AttackDetector {
    protected boolean active;
    protected CyberAttack attack;
    protected CyberSecurityManager manager;
    protected byte[] identificationSignature;
    
    public AttackDetector(CyberSecurityManager c) {
            active = false;
            attack = null;
            manager = c;
    } 

    public abstract void processPacket(byte[] packet);

    public void setIdentificationSignature(byte[] identificationSignature){
        this.identificationSignature = identificationSignature;
    }


}