package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banknotes20;
        int banknotes50;
        int banknotes100;
        Atm atm1 = new Atm(10, 20, 30);

        int answer = 0;
        while (answer != 4) {
            System.out.println("What do you wanna do? \n1 - add money\n2 - get money\n3 - current status\n4 - EXIT");
            answer = input.nextInt();

            switch (answer) {
                case 1 -> {
                    System.out.print("How much 20 banknotes do you wanna add ? ");
                    banknotes20 = input.nextInt();

                    System.out.print("How much 50 banknotes do you wanna add ? ");
                    banknotes50 = input.nextInt();

                    System.out.print("How much 100 banknotes do you wanna add ? ");
                    banknotes100 = input.nextInt();

                    atm1.addMoney(banknotes20, banknotes50, banknotes100);
                }
                case 2 -> {
                    System.out.print("How much money do you wanna get ? ");
                    answer = input.nextInt();

                    atm1.getMoney(answer);
                        System.out.println("banknote 20 -> " + atm1.col20);
                        System.out.println("banknote 50 -> " + atm1.col50);
                        System.out.println("banknote 100 -> " + atm1.col100);

                }
                case 3 -> {
                    System.out.println(atm1);
                }
                case 4 -> {
                    System.out.println("see you:)");
                }
            }
        }
    }
}
