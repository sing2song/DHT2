package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.SignIn;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    public SqlSession sqlSession;

    public SignIn signIn(String id) {
        System.out.println("SignIn");
        return sqlSession.selectOne("signInMapper.getPassword", id);
    }

}
