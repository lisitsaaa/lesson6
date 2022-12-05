package Computer;

public class RAM {
    String name;
    int size;

    RAM(){

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
