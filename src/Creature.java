public abstract class Creature {
    protected boolean alive;
    protected final int maxSize;
    protected int actualSize;

    public Creature(final int maxSize) {
        this.alive = true;
        this.actualSize = 1;
        this.maxSize = maxSize;
    }

    public void live() {
        if (actualSize < maxSize) {
            actualSize++;
        }
    }
    public int beingEaten(final int levelHunger) {
        int eaten = Math.min(actualSize, levelHunger);
        actualSize = actualSize - eaten;
        return eaten;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getActualSize() {
        return actualSize;
    }
}
