package Baseball;

import java.util.Scanner;

public class Baseball {

    private int[] ranNums;
    private int[] intputNums;


    // 랜덤 숫자배열 생성
    public int[] createRandomNum() {
        this.ranNums = new int[3];
        for(int i=0; i<3; i++) {
            ranNums[i] = (int)((Math.random()*9)+1);
        }
        return this.ranNums;
    }

    // 입력받은 문자열 배열에 담기
    public int[] inputNums(String str) throws Exception {
        if(str.length() > 3) throw new Exception();

        this.intputNums = new int[3];
        for(int i=0; i<3; i++) {
            int num = Character.getNumericValue(str.charAt(i));
            intputNums[i] = num;
        }
        return intputNums;
    }

    public void baseball() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해 주세요. : ");
        String value = scanner.nextLine();

    }
}
