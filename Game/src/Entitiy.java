public class Entitiy {
    private int hp;
    private int level;

    public Entitiy(int level, int hp) {
        this.level = level;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public void hit() {
        this.hp -= 10;
    }

    public void hit(int dmg) {
        this.hp -= dmg;
    }


}
