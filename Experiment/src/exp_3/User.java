package exp_3;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-05 14:47
 **/
public class User {
private String username;
private String passwd;
private int num;

    public User() {
    }

    public User(String username, String passwd, int num) {
        this.username = username;
        this.passwd = passwd;
        this.num = num;
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
