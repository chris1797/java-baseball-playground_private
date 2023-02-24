package StringCalculatorTest;

import StringCalculator.Calculator;
import StringCalculator.StringParsing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    StringParsing stringParsing;
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        stringParsing = new StringParsing();
    }

    @Test
    @DisplayName("계산기 테스트")
    void calculateTest() {
        assertThat(calculator.calculate(2, '*', 2)).isEqualTo(4);
    }

    @Test
    @DisplayName("나눗셈 예외 테스트")
    void exceptionTest() {
        assertThatThrownBy(() -> {
            calculator.calculate(2, '/', 0);

        }).isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("/ by zero");
    }


    @Test
    @DisplayName("문자열 계산기 테스트")
    void calculateStringTest() {
        assertThat(calculator.calculateString("2 + 3 * 4 / 2")).isEqualTo(10);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2", "+", "3", "*", "4", "/", "2"})
    @DisplayName("문자열 나누기 후 원소 포함여부 테스트")
    void seperateTest(String strings) {
        String[] values = stringParsing.seperateToArray("2 + 3 * 4 / 2");

        // 배열을 Stream으로 변환 후 anyMatch() 호출 -> 값 체크하는 람다식 or 메소드 참조식 전달
        assertThat(Arrays.stream(values).anyMatch(strings::equals));
    }
}
