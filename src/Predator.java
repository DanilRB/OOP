public abstract class Predator extends Beast{
    public Predator(int maxSize, int speed, int maxSatiety) {
        super(maxSize, speed, maxSatiety);
    }

    public void eat(Beast beast){
        if (beast.alive && beast.getSpeed() < speed) {
            actualSatiety += beast.beingEaten(maxSatiety - actualSatiety);
        }
    }
}
