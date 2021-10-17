import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
	private Calculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void initialize() {
        calculator = new Calculator();
    }
    
    @Test
    public void emptyStringShouldReturn0() {
        assertEquals(calculator.add(""), 0);
    }
    
    @Test
    public void numberStringShouldReturnSameNumber() {
        assertEquals(calculator.add("1"), 1);
        assertEquals(calculator.add("5"), 5);
    }
}
