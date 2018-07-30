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

    @DisplayName("Should return 3 if given two number 1,2 in String")
    @Test
    void test04() {
        //given
        String numbersInString = "1,2";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(3);
    }
    @DisplayName("Should return 10 if given two number 7,3 in String")
    @Test
    void test05() {
        //given
        String numbersInString = "7,3";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(10);
    }

    @DisplayName("Should return 6 if given three number 1,2,3 in String")
    @Test
    void test06() {
        //given
        String numbersInString = "1,2,3";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(6);
    }
    @DisplayName("Should return 10 if given 10 number 1,1,1,1,1,1,1,1,1,1 in String")
    @Test
    void test07() {
        //given
        String numbersInString = "1,1,1,1,1,1,1,1,1,1";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(10);
    }
    @DisplayName("Should return 3 if given 2 number 1\n2 in String")
    @Test
    void test08() {
        //given
        String numbersInString = "1\n2";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(3);
    }
}


