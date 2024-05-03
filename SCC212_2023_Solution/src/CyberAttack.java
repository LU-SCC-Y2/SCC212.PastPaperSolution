import java.util.Date;
public class CyberAttack {
    private String name; 
    private int intensity; 
    
    private Date start; 
    private Date end;

    public CyberAttack(String name) {
            this.name = name;
            this.intensity = 0;
            start = new Date();
    }
    public void update(int intensity){
        if (this.intensity < 0) return;
        // Slowly decay recorded intensity
        // but react quickly to increases in attack intensity
        if(intensity < this.intensity || (intensity == 0 && this.intensity == 0))
            this.intensity--;
        else
            this.intensity = intensity;
        // Once the attack has timed out, record the end time.

        if(this.intensity == -1)
            end = new Date();
    } 

    public String getName(){
        return name;
    }
}