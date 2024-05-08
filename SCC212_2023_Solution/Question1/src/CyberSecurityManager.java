import java.util.*;
public class CyberSecurityManager {
    private ArrayList<AttackDetector> detectors; private HashMap<String, CyberAttack> attackHistory;

    public CyberSecurityManager() {
        detectors = new ArrayList<>();
        attackHistory = new HashMap<>(); 
    }

    public void addDetector(AttackDetector d) {
            this.detectors.add(d);
    }
    public void packetReceived(byte[] b) {
        for (AttackDetector d : detectors) d.processPacket(b);
    }
    public void alert(CyberAttack a) {
        attackHistory.put(a.getName(), a); }
        
    public void showAttacks(){
        for (CyberAttack a : attackHistory.values()) System.out.println(a);
    } 
}