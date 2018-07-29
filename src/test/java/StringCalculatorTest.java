import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class StringCalculatorTest {

    @DisplayName("Should return 0 if given null")
    @Test
    void test01() {
        //given
        String numbersInString = "";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(0);
    }
    @DisplayName("Should return number if given number in String")
    @Test
    void test02() {
        //given
        String numbersInString = "1";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(1);
    }
}


