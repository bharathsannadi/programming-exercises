import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VectorTest {
    Vector vectorOne;
    Vector vectorTwo;

    @Before
    public void setUp() throws Exception {
        vectorOne = new Vector(1f, 2f);
        vectorTwo = new Vector(3f, 4f);
    }

    @Test
    public void shouldDisplayOutput() {
        assertThat(vectorOne.printCoordinates(), is("<1.0, 2.0>"));
    }

    @Test
    public void shouldAddTwoVectors() throws Exception {
        Vector vector = vectorOne.add(vectorTwo);
        assertThat(vector.printCoordinates(), is("<4.0, 6.0>"));
    }

    @Test
    public void shouldSubtractTwoVectors() throws Exception {
        Vector vector = vectorOne.subtract(vectorTwo);
        assertThat(vector.printCoordinates(), is("<-2.0, -2.0>"));
    }

    @Test
    public void shouldGetVectorLength() throws Exception {
        assertThat(vectorTwo.Length(), is(5d));

    }
}
