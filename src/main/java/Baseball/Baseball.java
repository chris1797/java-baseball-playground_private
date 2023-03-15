package Baseball;

import java.util.Arrays;
import java.util.Scanner;


public class Baseball {

    private int[] ranNums;
    private int[] inputNums;


    public Baseball() {
        createRandomNum();
    }


    // 랜덤 숫자배열 생성
    public int[] createRandomNum() {
        this.ranNums = new int[3];
        for(int i=0; i<3; i++) {
            ranNums[i] = (int)((Math.random()*9)+1);
        }
        return this.ranNums;
    }

    // 입력받은 문자열 배열에 담기
    public void parsingToIntArray(String str) throws Exception {
        if(str.length() != 3) throw new Exception("3자리 숫자가 아닙니다!");

        int[] intArray = new int[3];
        for(int i=0; i<3; i++) {
            int num = Character.getNumericValue(str.charAt(i));
            intArray[i] = num;
        }
        this.inputNums = intArray;
    }

    /*
    Scanner로 받은 숫자를 Array로 변환 후 랜덤숫자배열과 매칭
     */
    public String matchNum(String str) throws Exception {
        parsingToIntArray(str);

        int strikeCnt = 0;
        int ballCnt = 0;

        for(int i=0; i<3; i++) {
            if(ranNums[i] == inputNums[i]) strikeCnt++;
            if(ranNums[i] != inputNums[i] && Arrays.stream(ranNums).anyMatch(inputNums::equals)) {
                ballCnt++;
            }
        }

        if(ballCnt==0) return String.format("%d 스트라이크", strikeCnt);
        return String.format("%d 볼  %d 스트라이크", ballCnt, strikeCnt);

    }

    /*
     숫자야구게임 실행
     */
    public void gameStart() throws Exception {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("숫자를 입력해 주세요. : ");
            String str = scanner.nextLine();

            if(!"3 스트라이크".equals(matchNum(str))) {
                System.out.println(matchNum(str));
                continue;
            }

            if("3 스트라이크".equals(matchNum(str))) {
                System.out.println(matchNum(str));
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료 \n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            }

            String input = scanner.nextLine();
            if(input.equals("2")) break;
        }

    }

    public int[] getRanNums() {
        return ranNums;
    }

    public int[] getInputNums() {
        return inputNums;
    }
}
