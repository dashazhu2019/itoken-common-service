package tk.mybatis.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author shkstart
 * @date 2020/8/12  -  16:55
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
