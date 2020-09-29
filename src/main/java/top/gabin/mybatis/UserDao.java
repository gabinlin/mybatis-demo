package top.gabin.mybatis;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@CacheNamespace
public interface UserDao {
    @Options(flushCache = Options.FlushCachePolicy.TRUE, timeout = 2000)
    @Select("select * from User where id=#{id}")
    User selectUser(@Param(value = "id") Long id);
}
