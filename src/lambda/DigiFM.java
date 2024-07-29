package lambda;

public class DigiFM implements RadioBroadcast{
    @Override
    public void play(String message) {
        System.out.println("esti la digifm " + message);
    }
}