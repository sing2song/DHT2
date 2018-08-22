package ac.dankook.dht2.repository;

import ac.dankook.dht2.data.AverageData;
import ac.dankook.dht2.data.Data;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AverageRepositoryImpl implements AverageRepository {
    @Autowired
    private SqlSession sqlSession;

    public List<String> getTemperature(Data data) {
        System.out.println("getTemperature");
        return sqlSession.selectList("dataMapper.getTemperature",data);
    }
    public List<String> getHumidity(Data data) {
        System.out.println("getHumidity");
        return sqlSession.selectList("dataMapper.getHumidity", data);
    }
    public void insertAverageData(AverageData averageData) {
        System.out.println("setAverageData");
        sqlSession.selectOne("dataMapper.insertAverageData",averageData);
    }
    public AverageData getAverageData(AverageData averageData) {
        return sqlSession.selectOne("dataMapper.getAverageData",averageData);
    }

}
