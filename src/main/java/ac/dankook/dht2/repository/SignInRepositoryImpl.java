package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.SignIn;
import org.apache.ibatis.session.SqlSession;

public class SignInRepositoryImpl implements SignInRepository {
    public SqlSession sqlSession;

    public SignIn SignIn(Integer id) {
        System.out.println("SignIn");
        return sqlSession.selectOne("signinMapper.getPassword", id);
    }
}
