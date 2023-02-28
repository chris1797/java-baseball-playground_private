package Baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    }

    @Test
    @DisplayName("입력된 숫자 파싱 테스트")
    void inputNums() throws Exception {
        String str = "123";
        int[] inputNums = baseball.inputNums(str);
    }


    @Test
    void baseball() throws Exception {
        String input = "123";

        baseball.baseball();

    }
}