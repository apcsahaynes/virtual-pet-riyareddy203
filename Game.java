public class Game {
    private String name;
    public int happinessIncr;
    public int weightDecr;
    
    
    public Game (String name, int happinessIncr, int weightDecr) {
        this.name = name;
        this.happinessIncr = happinessIncr;
        this.weightDecr = weightDecr;
    }
    
    public String getName() {
        return name;
    }
    public int happinessIncr() {
        return happinessIncr;
    }
    public int weightDecr() {
        return weightDecr;
    }
    public boolean isWinner() {
        Math.random();
        if (Math.random()>0.5){
          return true;
        }
        else {
          return false;
        }
    }
    
}
