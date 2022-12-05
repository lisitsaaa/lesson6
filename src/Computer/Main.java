package Computer;
public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(3300, "ASUS");
        System.out.println(computer1);

        RAM ram1 = new RAM("DDR4", 16);
        HDD hdd1 = new HDD("Western digital",1000, "internal");

        Computer computer2 = new Computer(5000, "Macbook", ram1, hdd1);
        System.out.println(computer2);

    }

}
