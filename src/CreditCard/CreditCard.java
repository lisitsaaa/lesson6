package CreditCard;

public class CreditCard {
    int id;
    int accountNumber;
    double currentAmount;

    CreditCard() {
        id = 1;
        accountNumber = 123456789;
        currentAmount = 0.00;
    }

    CreditCard(int id, int accountNumber, double currentAmount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void getMoney(double moneyOperation) {
        if (this.currentAmount <= moneyOperation) {
            System.out.println("insufficient funds... check your current amount");
        } else {
            this.currentAmount = this.currentAmount - moneyOperation;

            System.out.println(currentAmount);
        }
    }

    public void putMoney(double moneyOperation) {
        this.currentAmount = this.currentAmount + moneyOperation;

        System.out.println(currentAmount);

    }

    public void printCurrentStatus() {
        System.out.println("card - " + id + " -> accountNumber = '" + accountNumber + '\'' +
                ", currentStatus = " + currentAmount);
    }
}
