package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    public SqlSession sqlSession;

    public User getPassword(String id) {
        System.out.println("User");
        return sqlSession.selectOne("signInMapper.getPassword", id);
    }

}
