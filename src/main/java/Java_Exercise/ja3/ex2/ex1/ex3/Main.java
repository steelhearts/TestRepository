package Java_Exercise.ja3.ex2.ex1.ex3;

public class Main {
    public static void main (String[] args){

        System.out.println("[メニュー]１：検索　２：登録　３：削除　４：変更＞");

        int selected = new java.util.Scanner ( System.in ).nextInt();
        switch (selected){
            case 1:
                System.out.println("検索");
                break;
            case 2:
                System.out.println("登録");
                break;
            case 3:
                System.out.println("削除");
                break;
            case 4:
                System.out.println("変更");
                break;
            default:
                break;
        }

    }
}
