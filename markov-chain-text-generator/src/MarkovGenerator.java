import java.util.ArrayList;

public class MarkovGenerator {
    private String input;

    public MarkovGenerator(String input) {
        this.input = input;
    }

    public Integer countChars() {
        return input.length();
    }

    public int countThisLetter(char matcher) {
        int count = 0;
        for (Character inputCharacter : input.toCharArray()) {
            if (inputCharacter == matcher){
                count += 1;
            }
        }
        return count;
    }

    public Float getProbability(char matcher) {
        return countThisLetter(matcher) / Float.valueOf(countChars());
    }

    public Character generateCharacter(float randomInput) {
        ArrayList<ProbabilityTree> bins = new ArrayList<ProbabilityTree>();
        for (char inputCharacter : input.toCharArray()) {

            boolean containsInputCharacter = false;
            for (ProbabilityTree probabilityTree : bins) {
                if (probabilityTree.character == inputCharacter){
                    containsInputCharacter = true;
                }
            }

            if (containsInputCharacter) {
                for (ProbabilityTree probabilityTree : bins) {
                    if (probabilityTree.character == inputCharacter) {
                        probabilityTree.probability += 1f / (float) countChars();
                    }
                }
            } else {
                bins.add(new ProbabilityTree(inputCharacter, (1f / (float) countChars())));
            }
        }
        for(int i = 0; i < bins.size(); i++) {
            float previousProbabilities = 0;
            for(int j = 0; j < i; j++) {
                previousProbabilities += bins.get(j).probability;
            }
            bins.get(i).probability = previousProbabilities;
        }
        for(int i = 0; i < bins.size(); i++) {
            if (randomInput <= bins.get(i).probability) {
                return bins.get(i).character;
            }
        }
        return null;
    }

}
