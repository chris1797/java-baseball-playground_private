package Baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BaseballTest {

    Baseball baseball;

    @BeforeEach
    void setUp() {
        baseball = new Baseball();
    }

    @Test
    @DisplayName("랜덤 숫자 생성 테스트")
    void createRandomNum() {
        int[] ranNums = baseball.createRandomNum();
        assertEquals(3, ranNums.length);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("입력된 숫자 파싱 테스트")
    void inputNums() throws Exception {
        String str = "123";
        /*
        baseball.parsingToIntArray(str)의 값이 ints와 같은지 테스트
         */
//        assertThat(Arrays.stream(inputNums).anyMatch(INT_STREAM::equals));
    }


    @Test
    void baseball() throws Exception {
        String input = "123";


    }
}