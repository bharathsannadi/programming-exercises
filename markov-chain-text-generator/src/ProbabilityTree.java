import java.util.ArrayList;

public class ProbabilityTree {
    public Character character = null;
    public float probability = 0;
    ArrayList<ProbabilityTree> nextLevel = new ArrayList<ProbabilityTree>();

    public ProbabilityTree(char character, float probability) {
        this.probability = probability;
        this.character = character;
    }
}
