package LWP;

import java.security.PrivateKey;

/**
 * @program: 多线程方式编写代码
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-26 20:54
 **/
public class KillThread extends Thread {

    private  Hero h1;
    private  Hero h2;

    public KillThread(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run() {
        while(!h2.isDead())
        {
            h1.attackHero(h2);
        }
    }
}
