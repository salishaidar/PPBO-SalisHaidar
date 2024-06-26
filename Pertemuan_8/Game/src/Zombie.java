public class Zombie extends Entitiy{
    enum type {
        MEELE, RANGED
    }
    private type type;

    public Zombie(int level, int hp, type type) {
        super(level, hp);
        this.type = type;
    }

    public void entityInfo() {
        System.out.println("ZOMBIE DENGAN TIPE : " + type + ", DAN LEVEL:" + super.getLevel());
    }

    private void ZombieHit(Player player) {
        switch (type) {
            case MEELE -> player.hit(20);
            case RANGED -> player.hit(15);
        }
    }

    public void attack(Player player) {
        if (player.getHp() > 0) {
            if (getHp() > 0) {
                ZombieHit(player);
                System.out.println("Player : UGHH");
                if (player.getHp() <= 0) {
                    System.out.println("# YOU DIE, GAME OVER");
                }
            } else {
                System.out.println("# ZOMBIE SUDAH MATI");
            }
        } else {
            System.out.println("# PLAYER SUDAH MATI");
        }
    }
}

