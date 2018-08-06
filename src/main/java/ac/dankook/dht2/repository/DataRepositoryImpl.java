package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.Data;
import ac.dankook.dht2.data.Device;
import ac.dankook.dht2.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataRepositoryImpl implements DataRepository{
    @Autowired
    private SqlSession sqlSession;

    public User insertData(Data data) {
        System.out.println("insertData");
        return sqlSession.selectOne("signInMapper.insertData",data);
    }

    public User setState(Device device) {
        System.out.println("setState");
        return sqlSession.selectOne("dataMapper.insertDeviceData",device);
    }
}
