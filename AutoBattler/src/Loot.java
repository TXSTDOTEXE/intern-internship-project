public class Loot {
    private int value;
    private String name;
    private enum Type { GOLD, SILVER, COPPER };
    
    public Loot(int value, String name, Type type) {
        this.value = value;
        this.name = name;
        this.type = type;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getName() {
        return name;
    }
    
    public Type getType() {
        return type;
    }
    
    public String toString() {
        return name + " (" + type + ")";
    }
}