import java.util.Set;

public abstract class Predator extends Beast{
    public Predator(int maxSize, int speed, int maxSatiety) {
        super(maxSize, speed, maxSatiety);
    }

    public void eat(Beast beast){
        if (beast.alive && beast.getSpeed() < speed) {
            actualSatiety += beast.beingEaten(missingSatiety());
        }
    }
    public void attackOnPack(Set<Beast> beasts){
        Beast slowestBeast = null;
        for(Beast beast:beasts){
            if ((slowestBeast == null || beast.getSpeed() < slowestBeast.getSpeed())&& beast.alive) {
                slowestBeast = beast;
            }
        }
        if (slowestBeast != null && slowestBeast.getSpeed() < speed) {
            actualSatiety += slowestBeast.beingEaten(missingSatiety());
        }
    }
}
