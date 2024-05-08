public class DemiGorgonVirus extends AttackDetector{
    private final byte[] packet = {5, 1, 13};

    public DemiGorgonVirus(CyberSecurityManager c){
        super(c);
        super.setIdentificationSignature(packet);
    }

    public void processPacket(byte[] givenPacket){
        int intensity = 0;
        // Count the occurence
        for (int i = 0; i < givenPacket.length; i ++){
            if (super.identificationSignature == packet){
                intensity += 1;
            }
        }
        if (intensity > 0){
            attack = new CyberAttack("Demigorgon Virus");
            attack.update(intensity);
        }else{
            attack.update(0);
        }
    }


}
