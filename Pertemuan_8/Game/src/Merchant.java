import java.util.ArrayList;

public class Merchant extends Entitiy{
    private ArrayList<String> listItem;

    public Merchant(int level, int hp, ArrayList<String> listItem) {
        super(level, hp);
        this.listItem = listItem;
    }

    public void entityInfo() {
        System.out.println("MERCHANT DENGAN LEVEL : " + super.getLevel());
    }

    public void displayItems() {
        System.out.println("Merchant :");
        System.out.println("Barang yang tersedia hari ini:");

        for (String i : listItem) {
            System.out.println("# " + i);
        }
    }
}

