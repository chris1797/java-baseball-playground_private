package StringCalculator;


import java.util.List;

public class Calculator {

    StringParsing stringParsing;


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
            System.out.println("값을 나눌 수 없습니다.");
        }

        return 0;
    }

    public int calculate(int i, char s, int j) {
        int num = 0;
        switch (s) {
            case '+':
                num = add(i,j);
            case '-':
                num = subtract(i,j);
            case '*':
                num = multiple(i,j);
            case '/':
                num = divide(i,j);
        }
        return num;
    }


    public int calculateString(String str) {
        stringParsing = new StringParsing();

        String[] strList = stringParsing.seperate(str);
        int num = stringParsing.parsingToInt(strList[0]);

        for(int i=0; i<strList.length-2; i+=2){
            num = calculate(num, strList[i+1].charAt(0), stringParsing.parsingToInt(strList[i+2]));
        }

        return num;
    }


}
