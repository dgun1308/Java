package basic;

public class Application3 {

    public static void main(String[] args) {

        Application3 app3 = new Application3();
        app3.Practice3();
    }

    public void Practice3() {
        for(int i = 1; i < 8; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
