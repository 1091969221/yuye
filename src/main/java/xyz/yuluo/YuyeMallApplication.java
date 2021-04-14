package xyz.yuluo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.yuluo.dao.TbNewbeeMallAdminUserDao;


@MapperScan("xyz.yuluo.dao")
@SpringBootApplication
public class YuyeMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuyeMallApplication.class, args);
    }


}
