import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int num1;
            int num2;
            int value;
            String str;
            String command;

            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            scanner = new Scanner(System.in);
            str = scanner.nextLine();

            switch (str) {
                case "+":
                    value = num1+num2;
                    System.out.println(value);
                    break;
                case "-":
                    value = num1-num2;
                    System.out.println(value);
                    break;
                case "*":
                    value = num1*num2;
                    System.out.println(value);
                    break;
                case "/":
                    try {
                        value = num1/num2;
                        System.out.println(value);
                    } catch (Exception e) {
                        System.out.println("나누기 오류");
                    } finally {
                        break;
                    }
            }

            System.out.println("종료하려면 exit을 입력하세요");
            command = scanner.nextLine();
            if(command.equals("exit")) break;
        }
    }

    public static void main2(String[] args) throws Exception {
        System.out.println("멀티스레드 구구단 시작");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=2; i<=9; i++) {
                    System.out.println(i + "단 구구단 시작");
                    for(int j=1; j<=9; j++) {
                        System.out.println(i + " * " + j + " =" + i*j);
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=2; i<=9; i++) {
                    System.out.println(i + "단 구구단 시작");
                    for(int j=1; j<=9; j++) {
                        System.out.println(i + " * " + j + " =" + i*j);
                    }
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("구구단 종료");
    }
}
