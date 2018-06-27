package Java_Exercise.ja3.ex2.ex1.ex4;

public class Main {
    public static  void main (String[] args){
        System.out.println("【数当てゲーム】");
        int ans = new java.util.Random().nextInt();

        for(int i=0; i<5 ; i++){
            System.out.println("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();

            if (num == ans){
                System.out.println("あたり");
            } else {
                System.out.println("違う");
            }

        }

        System.out.println("ゲーム終了");

    }
}
