public abstract class Beast extends Creature{
    protected int speed;
    protected final int maxSatiety;

    protected int actualSatiety;

    public Beast(final int maxSize, int speed, final int maxSatiety){
        super(maxSize);
        this.speed = speed;
        this.maxSatiety = maxSatiety;
        this.actualSatiety = 1;
    }
    public boolean isHungry(){
        return actualSatiety < 0.8 * maxSatiety;
    }

    @Override
    public void live() {
        super.live();
        if(--actualSatiety <= 0){
            alive = false;
        }
    }

    @Override
    public int beingEaten(final int levelHunger) {
        int eaten = super.beingEaten(levelHunger);
        alive = false;
        return eaten;
    }


    public int getSpeed() {
        return speed;
    }

    protected int missingSatiety(){
        return maxSatiety - actualSatiety;
    }
    public int getActualSatiety() {
        return actualSatiety;
    }

}
