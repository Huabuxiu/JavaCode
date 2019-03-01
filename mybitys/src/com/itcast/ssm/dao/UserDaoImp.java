package itcast.ssm.dao;



import itcast.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @program: mybitys
 * @description:
 * @author: Huabuxiu
 * @create: 2019-02-24 23:42
 **/
public class UserDaoImp extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("findUserById",id);
        return user;
    }


}
