package Hello;

/**
 * @program: JDBCdome
 * @description: Hero obj
 * @author: Huabuxiu
 * @create: 2018-10-25 22:27
 **/
public class Hero {

    public int id;
    public String name;
    public  float hp;
    public int damage;

    public Hero(int id, String name, float hp, int damage) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public Hero() {
    }



}
