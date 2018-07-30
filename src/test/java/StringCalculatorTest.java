import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class StringCalculatorTest {

    @DisplayName("Should return 0 if given null String")
    @Test
    void test01() {
        //given
        String numbersInString = "";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(0);
    }

    @DisplayName("Should return 1 if given 1 in String")
    @Test
    void test02() {
        //given
        String numbersInString = "1";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(1);
    }
    @DisplayName("Should return 33 if given 33 in String")
    @Test
    void test03() {
        //given
        String numbersInString = "33";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(33);
    }
}


