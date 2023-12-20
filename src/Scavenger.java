public abstract class Scavenger extends Beast{
    public Scavenger(int maxSize, int speed, int maxSatiety) {
        super(maxSize, speed, maxSatiety);
    }
    public void eat(Beast beast){
        if(!beast.alive){
            actualSatiety += beast.beingEaten(missingSatiety());
        }
    }
}
