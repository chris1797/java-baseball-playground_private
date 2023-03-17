public class Main2 {

    public static void main(String[] args) throws Exception {
        System.out.println("멀티스레드 구구단 시작");

        Thread t1 = new Thread(() -> {
            for (int i = 2; i <= 9; i++) {
                System.out.println("1번 스레드\n" + i + "단 구구단 시작");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 9; i++) {
                System.out.println("2번 스레드\n" + i + "단 구구단 시작");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        });

        t1.start();
//        t2.start();

        System.out.println("구구단 종료");
    }
}
