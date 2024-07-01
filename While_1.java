public class While_1 {

    public static void main(String[] args) {

        //반복문
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는 = " + count);

        count = count + 1;
        System.out.println("현재 숫자는 = " + count);

        count = count + 1;
        System.out.println("현재 숫자는 = " + count);
        //결과) 현재 숫자는 = 3

        while (count < 3) {
            count = count + 1;      //count ++;
            System.out.println("현재 숫자는 = " + count);
        }

        // false이면 빠져나갈 수 있다.
        /* while (false) {

         }*/

        //변경에 유연하지 않다.
        int sum = 0;

        sum = sum + 10;
        System.out.println("i = "+ 10 + "sum = " + sum); //10
        sum = sum + 11;
        System.out.println("i = "+ 11 + "sum = " + sum); //21
        sum = sum + 12;
        System.out.println("i = "+ 12 + "sum = " + sum); //33


        //변수(i)를 사용해서 더 변경하기 쉬운 코드로 만들자.
        int i= 10;

        sum = sum + i;
        i++;
        System.out.println("i = "+ i + "sum = " + sum); //10

        sum = sum + i;
        i++;
        System.out.println("i = "+ i + "sum = " + sum); //21

        sum = sum + i;
        i++;
        System.out.println("i = "+ i + "sum = " + sum); //33


        int j = 1;
        int endNum =3;

        while (j <= endNum) {
            sum = sum + j;
            System.out.println("j = "+ j + "sum = " + sum);
            j++;
        }
        //결과)j=1 sum=1 / j=2 sum=3 / j=3 sum=6


        //do-while 최초 한번은 항상 실행된다. 조건과 상관없이 무조건 while 출력
        do {
            System.out.println("현재숫자는 = " +j);
            j++;

        } while (j > endNum);


        //break - 반복문 즉시종료
        //continue - 즉시 다음 조건문 실행
        int total = 0;

        //계속실행 (무제한)
        while(true) {
            totla = total + j;  //+1+2+3...
            if(total > 10) {
                System.out.println("합이 10보다 크면 종료 : j= " + "total= " + total);
                break;
            }
            j++;
        }

        while (j <= 5) {
            if(j == 3) {
                j++;
                continue;
            }
            //j가 3일때 true이기때문에 실행안됨
            System.out.println(j);
            j++;

        }

        sum = sum + j;
        j++;
        System.out.println("j = "+ j + "sum = " + sum); //10

        sum = sum + j;
        j++;
        System.out.println("j = "+ j + "sum = " + sum); //21

        sum = sum + j;
        j++;
        System.out.println("j = "+ j + "sum = " + sum); //33


        //for문
        // ㅠㅠ 완전 망햇어ㅜㅠ
    }
}
