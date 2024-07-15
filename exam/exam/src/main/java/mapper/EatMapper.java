package mapper;

import entity.Eat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatMapper {
    List<Eat> selectAll(); //查询所有菜品,声明接口
    public void deleteById(String id);
    Eat selectById(String id);
    public int updateById(@Param("id")String id,@Param("price") int price,@Param("sort") String sort);
}
