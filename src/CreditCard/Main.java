package CreditCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard(2, 987654321, 123.45);
        CreditCard card3 = new CreditCard(3, 102030405, 55.19);

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
                    workWithGetMoney(card1, card2, card3);
                }
                case 2 -> {
                    workWithAddMoney(card1, card2, card3);
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

    public static void workWithGetMoney(CreditCard card1, CreditCard card2, CreditCard card3) {
        Scanner input = new Scanner(System.in);
        double moneyOperation;
        int answer;

        System.out.println("choose a card: \n1 - card 1\n2 - card 2\n3 - card 3");
        answer = input.nextInt();

        switch (answer) {
            case 1 -> {
                System.out.println("How much money do you wanna get?");
                moneyOperation = input.nextDouble();

                card1.getMoney(moneyOperation);
            }
            case 2 -> {
                System.out.println("How much money do you wanna get?");
                moneyOperation = input.nextDouble();

                card2.getMoney(moneyOperation);
            }
            case 3 -> {
                System.out.println("How much money do you wanna get?");
                moneyOperation = input.nextDouble();

                card3.getMoney(moneyOperation);
            }
        }

    }

    public static void workWithAddMoney(CreditCard card1, CreditCard card2, CreditCard card3) {
        int answer;
        double moneyOperation;
        Scanner input = new Scanner(System.in);

        System.out.println("choose a card: \n1 - card 1\n2 - card 2\n3 - card 3");
        answer = input.nextInt();

        switch (answer) {
            case 1 -> {
                System.out.println("How much money do you wanna put?");
                moneyOperation = input.nextDouble();

                card1.putMoney(moneyOperation);
            }
            case 2 -> {
                System.out.println("How much money do you wanna put?");
                moneyOperation = input.nextDouble();

                card2.putMoney(moneyOperation);
            }
            case 3 -> {
                System.out.println("How much money do you wanna put?");
                moneyOperation = input.nextDouble();

                card3.putMoney(moneyOperation);
            }
        }
    }
}
