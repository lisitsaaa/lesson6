package Computer;

public class RAM {
    String name;
    int size;

    RAM(){
        this.name = "DDR2";
        this.size = 8;

    }

    RAM(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' + ", size = " + size;
    }
}
