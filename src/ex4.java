import java.util.Scanner;
public class ex4 {
    public static void main(String[]args){
        String[] name={"james", "Cathy", "Kenny", "Martin", "Crystal"};
        Scanner sc = new Scanner(System.in);//Scanner 객체 생성
        int[] height = new int[5];
        int sum=0;

        for(int i=0;i<5;i++) {
            System.out.print(name[i]+"의 신장을 입력하세요! ");
            height[i] = sc.nextInt();
            sum += height[i];
        }

        int avg= sum/height.length;

        for(int j=0;j<5;j++) {
            System.out.println(name[j]+"의 키는 "+height[j]+"입니다.");
        }
        System.out.println("신장의 합계 : "+sum);
        System.out.println("평균 신장 : "+avg);

    }
}
