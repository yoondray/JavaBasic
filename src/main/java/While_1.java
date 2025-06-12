package src.main.java;

public class While_1 {

    //변수의 값을 복사해서 전달함 => Java는 num2의 값을 바꾸더라도 num1의 값은 바뀌지 않는다.
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNum 호출 전 = " + num1);
        changeNum(num1);
        System.out.println("4. changeNum 호출 후 = " + num1);

        changeNum(num1);
        //changeNum(5);

        changeInt(num1);
        System.out.println("5. num1에 값 복사 전 = " + num1);
        num1 = changeInt(num1);
        System.out.println("6. changeInt 호출 후 = " + num1);

    }

    public static void changeNum(int num2) {
        //int num2 = 5;
        System.out.println("2. num2값 변경 전 = " + num2);
        num2 = num2 * 2;
        System.out.println("3. num2값 변경 후 = " + num2);
        num2 = 10;
    }

    public static int changeInt(int number) {
        number = number * 2;
        return number;
    }
}
