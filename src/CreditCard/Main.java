package CreditCard;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        double moneyOperation;
        CreditCard card1 = new CreditCard(1,987654321, 123.45);
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard(3,102030405, 55.19);

        while (answer != 4) {
            System.out.println("""
                    What do you wanna do?\s
                    1 - get money
                    2 - put money
                    3 - check your current status
                    4 - EXIT""");
            answer = input.nextInt();

            switch (answer) {
                case 1 -> {
                    System.out.println("choose a card: \n1 - card 1\n2 - card 2\n3 - card 3");
                    answer = input.nextInt();

                    switch (answer) {
                        case 1 -> {
                            System.out.println("How much money do you wanna get?");
                            moneyOperation = input.nextDouble();

                            card1.getMoney(card1.currentAmount, moneyOperation);
                        }
                        case 2 -> {
                            System.out.println("How much money do you wanna get?");
                            moneyOperation = input.nextDouble();

                            card2.getMoney(card2.currentAmount, moneyOperation);
                        }
                        case 3 -> {
                            System.out.println("How much money do you wanna get?");
                            moneyOperation = input.nextDouble();

                            card3.getMoney(card3.currentAmount, moneyOperation);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("choose a card: \n1 - card 1\n2 - card 2\n3 - card 3");
                    answer = input.nextInt();

                    switch (answer) {
                        case 1 -> {
                            System.out.println("How much money do you wanna put?");
                            moneyOperation = input.nextDouble();

                            card1.putMoney(card1.currentAmount, moneyOperation);
                        }
                        case 2 -> {
                            System.out.println("How much money do you wanna put?");
                            moneyOperation = input.nextDouble();

                            card2.putMoney(card2.currentAmount, moneyOperation);
                        }
                        case 3 -> {
                            System.out.println("How much money do you wanna put?");
                            moneyOperation = input.nextDouble();

                            card3.putMoney(card3.currentAmount, moneyOperation);
                        }
                    }
                }
                case 3 -> {
                    card1.printCurrentStatus();
                    card2.printCurrentStatus();
                    card3.printCurrentStatus();
                }
                case 4 -> System.out.println("see you :)");
            }
            System.out.println();
        }
    }
}
