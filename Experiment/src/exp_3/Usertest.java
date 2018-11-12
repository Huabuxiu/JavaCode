package exp_3;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-05 15:15
 **/
public class Usertest {
    public static void main(String[] args) {
        User user= new User(null,null,3);
        user.setPasswd("大王叫我来巡山");
        user.setUsername("Huabuxiu");
        System.out.println("用户名"+user.getUsername());
        System.out.println("口令" +
        user.getPasswd());

    }
}
