package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.data.SignIn;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataRepositoryImpl implements DataRepository{
    @Autowired
    private SqlSession sqlSession;

    public SignIn insertData(Data data) {
        System.out.println("insertData");
        return sqlSession.selectOne("signInMapper.insertData",data);
    }
}
