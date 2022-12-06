package Computer;

public class Computer {
    int cost;
    String model;
    RAM ram;
    HDD hdd;

    Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram =  new RAM();
        this.hdd = new HDD();
    }

    Computer(int cost, String model, RAM ram, HDD hdd) {
        this(cost, model);
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "cost = " + cost +
                ", model = '" + model + '\'' +
                ", RAM = " + ram +
                ", HDD = " + hdd +
                '}';
    }
}
