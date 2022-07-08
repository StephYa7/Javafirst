import java.util.Scanner;

public class test_next {
    public static void main(String[] args) {
        // scanint(args);
        // scanline();
        // testswitch(args);
        testPr();

    }

    public static void scanint(String[] args) {
        System.out.println("Введите 2 числа: ");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        int inputNumberSecond = scan.nextInt();
        System.out.println(inputNumber + inputNumberSecond);
    }

    public static void scanline() {
        System.out.println("Введите что нибудь: ");
        Scanner scan = new Scanner(System.in);
        String firstString = scan.nextLine();
        String secondString = scan.nextLine();
        System.out.println(secondString+firstString);

    }
    public static void testswitch(String args[]){
		System.out.println("Введите 1, 2, 3 или 4");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
 
		switch (number){
		case 1: System.out.println ("Вы ввели число 1"); break;
		case 2: System.out.println ("Вы ввели число 2"); break;
		case 3: System.out.println ("Вы ввели число 3"); break;
		case 4: System.out.println ("Вы ввели число 4"); break;
		default: System.out.println("Вы ввели неправильное число");
		}
	}
    public static void testPr() {
        // int a = 128+128+256;
        // byte b = (byte) a;
        // System.out.println(b);
        int g =(int) ( 20 +Math.random()*20); // от 20 до 40
        System.out.println(g);


        
    }
    
}
