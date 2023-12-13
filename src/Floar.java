public abstract class Floar extends Creature{
    public Floar(final int maxSize) {
        super(maxSize);
    }

    @Override
    public int beingEaten(final int actualSize) {
        int degree = super.beingEaten(actualSize);
        if(actualSize == 0){
            alive = false;
        }
        return degree;
    }
}
