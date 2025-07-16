package basic;

public class Application3 {
    public static void main(String[] args) {
        double kor1 = 80.5;
        double math1 = 50.6;
        double english1 = 70.8;
        int sum1 = (int) (kor1 + math1 + english1);
        int average1 = (int) (sum1 / 3);
        System.out.println("총점 = " + sum1);
        System.out.println("평균 = " + average1);
    }
}
