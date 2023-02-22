package StringCalculator;


import java.util.List;

public class Calculator {

    StringParsing stringParsing = new StringParsing();


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
        return a/b;
    }

    public int calculate(int i, char s, int j) {

        if(s == '+') return add(i, j);
        if(s == '-') return subtract(i, j);
        if(s == '*') return multiple(i, j);
        if(s == '/') return divide(i, j);
        return 0;
    }

    public int calculateString(String str) {
        String[] strList = stringParsing.seperateToArray(str);
        int num = stringParsing.parsingToInt(strList[0]);

        for(int i=0; i<strList.length-2; i+=2){
            num = calculate(num, strList[i+1].charAt(0), stringParsing.parsingToInt(strList[i+2]));
        }

        return num;
    }

    public int calculateString2(String[] strArray) {
        int num = stringParsing.parsingToInt(strArray[0]);

        for(int i=0; i<strArray.length-2; i+=2){
            num = calculate(num, strArray[i+1].charAt(0), stringParsing.parsingToInt(strArray[i+2]));
        }

        return num;
    }


}
