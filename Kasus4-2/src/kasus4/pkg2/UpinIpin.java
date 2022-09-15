package kasus4.pkg2;
public class UpinIpin {
    public static void main(String[] args) {
        Item n = new Item("Upin");
    }    
}

class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        this();
        System.out.println(this.name);
    }
}

// 4 menit
