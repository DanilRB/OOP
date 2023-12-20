
public class Main {
    public static void main(String[] args) {
            Predator olesha = new Predator(10, 10, 10) {};
            Scavenger kostrat = new Scavenger(8,5,8) {};

            olesha.eat(kostrat);
        System.out.println(olesha.getActualSatiety());
        System.out.println(kostrat.isAlive());
    }
}