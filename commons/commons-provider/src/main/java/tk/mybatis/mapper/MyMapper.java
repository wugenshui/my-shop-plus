package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author : chenbo
 * @date : 2020-01-19
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

