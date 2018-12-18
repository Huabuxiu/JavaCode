package exp_7;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-12-17 09:11
 **/
public class systemuse {

    public  void showsystemvaleu()
    {
        //用户名、用户目录、操作系统名、操作系统架构、操作系统版本、文件分隔符、路径分隔符

        String usenaem = System.getProperty("user.name");
        String usedir = System.getProperty("user.dir");
        String osname = System.getProperty("os.name");
        String osStructure = System.getProperty("os.arch");
        String osEdition = System.getProperty("os.version");
        String fileSeparator = System.getProperty("file.separator");
        String pathSeparator = System.getProperty("path.separator");

        System.out.printf("用户名、%s\n用户目录、%s\n操作系统名、%s\n操作系统架构、%s\n" +
                "操作系统版本、%s\n文件分隔符、%s\n路径分隔符 %s",usenaem,usedir,osname,osStructure,osEdition,fileSeparator,pathSeparator);
    }



}
