package utils;

/*import entity.Admins;
import mapper.AdminsMapper;*/
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    public static SqlSession getSqlSession(){

            String resource="mybatis-config.xml";
            InputStream inputStream=null;

            try{
                inputStream= Resources.getResourceAsStream(resource);

            } catch (IOException e){
                throw new RuntimeException(e);
            }
            SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession= sqlSessionFactory.openSession(true);
            System.out.println(sqlSession);


    return sqlSession;
    }



}
