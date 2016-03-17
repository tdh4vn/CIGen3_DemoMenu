/**
 * Created by hungtran on 3/17/16.
 */
public class Main {
    public static void main(String [] args){
        Thread thread = new Thread(new GameWindow());
        thread.start();

    }
}
