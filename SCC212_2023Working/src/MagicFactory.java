public class MagicFactory{
    private int totalSold = 0;
    private int eggCount = 0;

    public void calculateEgg(int chickenCount){
        if (totalSold >= chickenCount * 10){
            return;
        }
        for (int i = 0; i < chickenCount * 10; i++){
            totalSold ++;
            eggCount ++;

            if (Math.random() <= 0.1){
                totalSold --;
                calculateEgg(chickenCount + 1);
            }
        }
    }
    public int getTotalSold(){
        return this.totalSold;
    }
}