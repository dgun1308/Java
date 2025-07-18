package basic;

public class Application1 {

    public static void main(String[] args) {

        Application1 app1 = new Application1();
        app1.Practice1();

    }

    public void Practice1() {
        int sum = 0;
        for(int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지 더한 합계 = " + sum);
    }
}
