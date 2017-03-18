package iloveyouboss;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felipe.affonso on 17/03/17.
 */
public class ScoreCollection {

    private List<Scoreable> scores = new ArrayList<>();

    public void add(final Scoreable scoreable) {
        scores.add(scoreable);
    }

    public int arithmeticMean() {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        return total / scores.size();
    }
}
