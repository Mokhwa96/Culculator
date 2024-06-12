package src.com.codestates.seb.calculator;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");
    String firstnum ="";
    char calculate = ' ';
    String secondnum ="";
    boolean check_calulate = false;
  while (true) {
    System.out.println("계산식을 작성해주세요, 종료하시려면 END를 입력해주세요.");
    Scanner input = new Scanner(System.in);
    String inputValue = input.nextLine();
    if (inputValue.toLowerCase().equals("end")){
      System.out.println("종료하겠습니다.");
      break;
    }
    System.out.println(inputValue);
    for (int i = 0; i < inputValue.length(); i++) {
      if (inputValue.charAt(i) == '+' || inputValue.charAt(i) == '-' || inputValue.charAt(i) == '*' || inputValue.charAt(i) == '/') {
        firstnum = inputValue.substring(0, i);
        calculate = inputValue.charAt(i);
        secondnum = inputValue.substring(i + 1, inputValue.length());
//        System.out.println(firstnum);
//        System.out.println(calculate);
//        System.out.println(secondnum);
        check_calulate = true;
      }
    }
    if (check_calulate == true) {
      double num1 = Double.parseDouble(firstnum);
      double num2 = Double.parseDouble(secondnum);
      double answer = 0;
      if (calculate == '+') {
        answer = num1 + num2;
      } else if (calculate == '-') {
        answer = num1 - num2;
      } else if (calculate == '*') {
        answer = num1 * num2;
      } else if (calculate == '/') {
        answer = num1 / num2;
      }
      System.out.println(answer);
    } else {
      System.out.println("잘못된 입력");
    }
    System.out.println("종료할까요?");
  }
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
    //
  }
}

