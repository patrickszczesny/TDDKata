import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class StringCalculatorTest {

    @DisplayName("Should return 0 if given null")
    @Test
    void test01(){
    //given
    String givenNumbersInString ="";
    //when
    int result = StringCalculator.add(givenNumbersInString);
    //then
        Assertions.assertThat(result).isEqualTo(0);
   }

    @DisplayName("Should return the value of the number it's given")
    @Test
    void test02(){
        //given
        String givenNumbersInString ="1";
        //when
        int result = StringCalculator.add(givenNumbersInString);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }
}
