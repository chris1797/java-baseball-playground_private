package Baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baseball {

    private int[] ranNums;
    private int[] inputNums;


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
    랜덤숫자배열과 입력숫자배열 매칭
     */
    public String matchNum(String str) throws Exception {
        parsingToIntArray(str);

        int strikeCnt = 0;
        int ballCont = 0;

        for(int i=0; i<3; i++) {
            if(ranNums[i] == inputNums[i]) strikeCnt++;
            if(ranNums[i] != inputNums[i] && Arrays.stream(ranNums).anyMatch(int));
        }

        return matchCount;
    }

    /*
     숫자야구게임 실행
     */
    public void baseball() throws Exception {
        createRandomNum();
        int matchCnt = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("숫자를 입력해 주세요. : ");
            String intVal = (String)scanner.nextLine();
            System.out.print("1볼 1스트라이크");
            String value = scanner.nextLine();
            this.inputNums = parsingToIntArray(value);
            matchCnt = matchNum();
        }

    }
}
