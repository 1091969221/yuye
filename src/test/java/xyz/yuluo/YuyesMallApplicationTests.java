package xyz.yuluo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.yuluo.dao.TbNewbeeMallAdminUserDao;
import xyz.yuluo.entity.TbNewbeeMallAdminUser;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class YuyesMallApplicationTests {
//    数据库连接
    @Autowired
    private DataSource dataSource;
//    测试easycode
    @Autowired
    private TbNewbeeMallAdminUserDao tbNewbeeMallAdminUserDao;

    @Test
    void contextLoads() throws SQLException {

        System.out.println(dataSource.getConnection());

        System.out.println( tbNewbeeMallAdminUserDao.queryAll(null));
    }



}
