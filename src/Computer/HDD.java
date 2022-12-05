package Computer;

public class HDD {
    String name;
    int size;
    String type;

    HDD(){

    }

    HDD(String name, int size, String type){
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", size = " + size +
                ", type = '" + type + '\'';
    }
}
