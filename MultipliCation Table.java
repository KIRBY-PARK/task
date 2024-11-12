package week02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        // 입력받는 단을 제외하고 출력!
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 몇단이 궁금하신가요? (숫자만 입력) : ");
        int wantNum = sc.nextInt(); // 출력을 제외할 구구단 수 값

        if (wantNum <= 9){
            // 구구단
            for (int i = wantNum; i <= wantNum; i++) { // 구구단의 첫 째 수
                System.out.println("[ " + i + "단 ]");
                for (int j = 1; j <= 9; j++) // 구구단의 두 번째 수
                    System.out.println(i + " X " + j + " = " + (i*j));
            }
        } else {
            System.out.println("1부터 9까지 입력이 가능합니다. 다시 입력해주세요.");
        }
    }
}

// System.out.println("잘못입력하셨습니다.");