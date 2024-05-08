public class Player extends Entitiy {
    private String name;

    public Player(int level, int hp, String name) {
        super(level, hp);
        this.name = name;
    }

    public void entityInfo() {
        System.out.println("PLAYER DENGAN NAMA :  " + name + ", DAN LEVEL:" + super.getLevel());
    }

    public void interact(Merchant merchant) {
        if (super.getHp() > 0) {
            if (merchant.getHp() > 0) {
                merchant.displayItems();
            } else {
                System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
            }
        } else {
            System.out.println("# PLAYER SUDAH MATI");
        }
    }

    public void test() {
        System.out.println(super.getHp());
    }

    public void attack(Merchant merchant) {
        if (merchant.getHp() > 0) {
            merchant.hit();
            System.out.println("Merchant : hey heyy, ngapain nyerang");
            if (merchant.getHp() <= 0) {
                System.out.println("Merchant : dah lah males jualan");
            }
        }
    }

    public void attack(Zombie zombie) {
        if (zombie.getHp() > 0) {
            zombie.hit();
            System.out.println("Zombie : GRAAA!");
            if (zombie.getHp() <= 0) {
                System.out.println("# ZOMBIE MATI");
            }
        } else {
            System.out.println("# PLAYER SUDAH MATI");
        }
    }
}
