package LWP;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-26 20:59
 **/
public class TestThread2 {
    public static void main(String[] args) {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;
        KillThread kt1 = new KillThread(gareen,teemo);
        KillThread kt2 = new KillThread(bh,leesin);
        kt1.start();
        kt2.start();
    }
}
