import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void shouldDisplayScoreForNullGame() throws Exception {
        assertThat(game.displayScore(), is("0/0"));
    }

    @Test
    public void shouldDisplayFifteenZeroWhenPlayerOneScores() throws Exception {
        game.scores(0);
        assertThat(game.displayScore(), is("15/0"));
    }


}
