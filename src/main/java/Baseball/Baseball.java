package Baseball;

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
    public int[] parsingToIntArray(String str) throws Exception {
        if(str.length() > 3) throw new Exception();

        this.inputNums = new int[3];
        for(int i=0; i<3; i++) {
            int num = Character.getNumericValue(str.charAt(i));
            inputNums[i] = num;
        }
        return inputNums;
    }

    public int matchNum() {
        int matchCount = 0;
        if(ranNums[0] == inputNums[0]) matchCount++;
        if(ranNums[1] == inputNums[1]) matchCount++;
        if(ranNums[2] == inputNums[2]) matchCount++;

        return matchCount;
    }

    public void baseball() throws Exception {
        createRandomNum();
        int matchCnt = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("숫자를 입력해 주세요. : ");
            System.out.print("1볼 1스트라이크");
            String value = scanner.nextLine();
            this.inputNums = parsingToIntArray(value);
            matchCnt = matchNum();
        }

    }
}
