import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
    public static final int GAME_TICK = 1000; // 1 second in milliseconds
    private Timer timer;

    public GameTimer() {
        timer = new Timer();
    }

    public void start(Runnable gameUpdateTask) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                gameUpdateTask.run();
            }
        }, 0, GAME_TICK);
    }

    public void stop() {
        timer.cancel();
    }
}
