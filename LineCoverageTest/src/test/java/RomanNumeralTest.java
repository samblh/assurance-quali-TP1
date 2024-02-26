import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RomanNumeralTest {
    @ParameterizedTest
    @CsvFileSource(resources = "C:\\Users\\pc\\Desktop\\tp assurance\\assurance-qualite-TP1\\LineCoverageTest\\src\\test\\java\\test.csv",numLinesToSkip = 1)
    void TestToRoman(int input, String expectedValue){
        Assertions.assertEquals(expectedValue, input);
    }
}
