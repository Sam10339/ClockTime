

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    /**
     * Default constructor for test class test
     */
    public test()
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
    public void Same()
    {
        ClockTime clockTim1 = new ClockTime(11, 11, 11);
        ClockTime clockTim2 = new ClockTime(11, 11, 11);
        assertEquals(true, clockTim1.equals(clockTim2));
    }

    @Test
    public void Diff()
    {
        ClockTime clockTim1 = new ClockTime(11, 11, 11);
        ClockTime clockTim2 = new ClockTime(12, 12, 12);
        assertEquals(false, clockTim1.equals(clockTim2));
    }
}


