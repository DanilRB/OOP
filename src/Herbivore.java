public abstract class Herbivore extends Beast{
    public Herbivore(int maxSize, int speed, int maxSatiety) {
        super(maxSize, speed, maxSatiety);
    }

    public void eat(Floar eaten){
        actualSatiety += eaten.beingEaten(maxSatiety - actualSatiety);
    }
}
