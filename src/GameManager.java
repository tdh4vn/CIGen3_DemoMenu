import java.util.Stack;

/**
 * Created by hungtran on 3/17/16.
 */
public class GameManager {
    public Stack<Scene> stackMenuGame;
    private static GameManager ourInstance = new GameManager();

    public static GameManager getInstance() {
        return ourInstance;
    }

    private GameManager() {
        stackMenuGame = new Stack<Scene>();
    }
}
