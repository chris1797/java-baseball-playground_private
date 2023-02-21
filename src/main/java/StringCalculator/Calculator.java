package StringCalculator;


public class Calculator {


    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiple(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println("첫번째 값을 두번째 값으로 나눌 수 없습니다.");
        }

        return 0;
    }


}
