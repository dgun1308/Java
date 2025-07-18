package basic;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.Practice4();

    }

    public void Practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            if(i%2==0)
                sum += i;
            }
            System.out.println("1 부터 " + num + " 까지 짝수의 합 : " + sum);
        }
    }
