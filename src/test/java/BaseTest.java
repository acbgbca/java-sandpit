import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class BaseTest
{
    @Test
    @DisplayName("Hard coded test")
    public void testApp()
    {
        assertTrue( true );
    }

    @ParameterizedTest
    @DisplayName("Parameterized test")
    @ValueSource(strings = {"One", "two"})
    public void parameterizedTest(String value)
    {
        assertNotNull( value );
    }

    @ParameterizedTest
    @DisplayName("Parameterized test")
    @CsvSource({"One,One", "two,two"})
    public void parameterizedTest(String input, String expected)
    {
        assertEquals(expected, input);
    }
}
