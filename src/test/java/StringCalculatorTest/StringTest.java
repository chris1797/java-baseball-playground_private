package StringCalculatorTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void 요구사항1() {
        String[] str = "1,2".split(",");
        assertThat(str).contains("1");
        assertThat(str).contains("2");
    }

    @Test
    void 요구사항2() {
        String str = "(1,2)".substring(1, 4);
        assertThat(str).isEqualTo("1,2");
    }

    @Test
    @DisplayName("StringIndexOutOfBoundsException 예외 던지기")
    void 요구사항3() {
        // given
        String str = "abc";

        // when, then
        assertThatThrownBy(() -> {
            str.charAt(str.length());
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining(String.format("String index out of range: %d", str.length()));
    }
}
