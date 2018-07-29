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
    @DisplayName("Should return number if given number in String")
    @Test
    void test03() {
        //given
        String numbersInString = "100000";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(100000);
    }

    @DisplayName("Should return sum of 2 number if given 2 number in String")
    @Test
    void test04() {
        //given
        String numbersInString = "1,2";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(3);
    }

    @DisplayName("Should return sum of 3 number if given 2 number in String")
    @Test
    void test05() {
        //given
        String numbersInString = "1,2,3";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(6);
    }
    @DisplayName("Should return sum of 10 number if given 10 number in String")
    @Test
    void test06() {
        //given
        String numbersInString = "1,2,3,4,5,6,7,8,9,10";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(55);
    }

    @DisplayName("Should return sum of 10 number if given 10 number in String")
    @Test
    void test07() {
        //given
        String numbersInString = "1,2,3,4,5,6,7,8,9,10";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(55);
    }

    @DisplayName("Should return sum of 3 number if given in String and seperate with '\n and ,")
    @Test
    void test08() {
        //given
        String numbersInString = "1\n2,3";
        //when
        int resultOfSum = StringCalculator.Add(numbersInString);
        //then
        Assertions.assertThat(resultOfSum).isEqualTo(6);
    }
}


