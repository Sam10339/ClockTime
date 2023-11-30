

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Clock1.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Clock1
{
    /**
     * Default constructor for test class Clock1
     */
    public Clock1()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void UnitTest()
    {
        ClockTime clockTim3 = new ClockTime(11, 01, 01);
        ClockTime clockTim4 = new ClockTime(11, 01, 01);
        assertEquals(true, clockTim3.equals(clockTim4));
        ClockTime clockTim5 = new ClockTime(12, 02, 02);
        assertEquals(false, clockTim3.equals(clockTim5));
    }
}

