import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarkovGeneratorTest {

    String input;
    MarkovGenerator markovGenerator;

    @Before
    public void setUp() throws Exception {
        input = "asdf;lknag";
        markovGenerator = new MarkovGenerator(input);
    }

    @Test
    public void shouldCountAllCharactersInInput() throws Exception {
        assertThat(markovGenerator.countChars(), is(10));
    }

    @Test
    public void shouldCountInstancesOfACharacter() throws Exception {
        assertThat(markovGenerator.countThisLetter('a'), is(2));
    }

    @Test
    public void shouldReturnProbabilityOfACharacter() throws Exception {
        assertThat(markovGenerator.getProbability('a'), is(0.2f));

    }

    @Test
    public void shouldReturnARandomLetterGivenProbabilitiesFromInputText() {
        assertThat(markovGenerator.generateCharacter(.0f), is('a'));
    }
}
