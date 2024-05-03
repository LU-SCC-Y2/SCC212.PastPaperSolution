import java.util.Arrays;

public abstract class AttackDetector {
    protected boolean active;
    protected CyberAttack attack;
    protected CyberSecurityManager manager;

    public AttackDetector(CyberSecurityManager c) {
            active = false;
            attack = null;
            manager = c;
    } 

    public abstract void processPacket(byte[] b);

    public boolean isPreviousPacketEqual(byte[] previousPacket, byte[] givenPacket){
        if (Arrays.equals(previousPacket, givenPacket)){
            return true;
        }
        return false;
    }

    public int countOccurence(byte[] packetData, byte[] packet) {
        int count = 0;
        for (int i = 0; i <= packetData.length - packet.length; i++) {
            if (Arrays.equals(Arrays.copyOfRange(packetData, i, i + packet.length), packet)) {
                count++;
            }
        }
        return count;
    }

}