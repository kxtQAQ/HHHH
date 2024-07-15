package service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.Eat;
import mapper.EatMapper;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtil;

import java.util.List;

public class EatServiceImpl {
    public PageInfo queryAll(int pageNum, int pageSize) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EatMapper mapper = sqlSession.getMapper(EatMapper.class);
        PageHelper.startPage(pageNum, 4); //分页类型
        /*List<> list = mapper.selectAll();*/
        List<Eat> list = mapper.selectAll();
        PageInfo pageInfo = new PageInfo(list); //将list表赋值给PageInfo

        return pageInfo;
    }

    public void delete(String id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EatMapper mapper = sqlSession.getMapper(EatMapper.class);
        mapper.deleteById(id);

    }
    public int update(String id, int price, String sort){
            SqlSession sqlSession = MybatisUtil.getSqlSession();
            EatMapper mapper = sqlSession.getMapper(EatMapper.class);
            mapper.updateById(id,price,sort);


        return price;
    }
    public Eat queryById(String id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EatMapper mapper = sqlSession.getMapper(EatMapper.class);
        Eat eat = mapper.selectById(id);
        return eat;
    }
}