package ATM;

public class Atm {
    int banknotes20;
    int banknotes50;
    int banknotes100;

    int col20;
    int col50;
    int col100;
    int sum;

    Atm(int banknotes20, int banknotes50, int banknotes100) {
        this.banknotes20 = banknotes20;
        this.banknotes50 = banknotes50;
        this.banknotes100 = banknotes100;
        sum = banknotes20 * 20 + banknotes50 * 50 + banknotes100 * 100;
    }

    public void addMoney(int banknotes20, int banknotes50, int banknotes100) {
        sum = sum + banknotes20 * 20 + banknotes50 * 50 + banknotes100 * 100;
        this.banknotes20 += banknotes20;
        this.banknotes50 += banknotes50;
        this.banknotes100 += banknotes100;
        System.out.println(sum);
    }

    public boolean getMoney(int amount) {
        if (amount > sum) {
            System.out.println("sorry, atm doesn't have this sum");
            return false;
        }

        boolean status = false;
        int intermediateSum;
        int countSum = 1000;

        for (int i = 0; i < this.banknotes20; i++) {
            for (int j = 0; j < this.banknotes50; j++) {
                for (int k = 0; k < this.banknotes100; k++) {
                    intermediateSum = i * 20 + j * 50 + k * 100;
                    if (intermediateSum == amount) {
                        if (countSum > i + j + k) {
                            countSum = i + j + k;
                            this.col20 = i;
                            this.col50 = j;
                            this.col100 = k;
                            sum = sum - i * 20 - j * 50 - k * 100;
                        }
                        status = true;
                    }
                }
            }
        }

        if (status) {
            this.banknotes20 -= col20;
            this.banknotes50 -= col50;
            this.banknotes100 -= col100;
        }
        //sum = sum - this.banknotes20 - this.banknotes50 - this.banknotes100;
        System.out.println(status);
        return status;
    }

    @Override
    public String toString() {
        return "sum = " + sum;
    }
}
