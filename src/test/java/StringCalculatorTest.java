import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @DisplayName("The method Add Should return 0 for null String")
    @Test
    void test01() {
        //given
        String numberInString="";
        //when
        int result= StringCalculator.Add(numberInString);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }
    @DisplayName("The method Add Should return the number 1 in int when given 1 in String")
    @Test
    void test02() {
        //given
        String numberInString="1";
        //when
        int result= StringCalculator.Add(numberInString);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

}


