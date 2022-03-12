package cn.xiaocai.demo.kingbase.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MybatisMysqlConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/22 18:01
 * @Version ： 1.0

 * Mybatis主数据源ds1配置
 * 多数据源配置依赖数据源配置
 */
@Configuration
@MapperScan(basePackages ="cn.xiaocai.demo.kingbase.web.mapper.kingbase", sqlSessionTemplateRef  = "ds2SqlSessionTemplate")
public class MybatisKingBaseConfig {

    //ds2数据源
    @Bean("ds2SqlSessionFactory")
    public SqlSessionFactory ds2SqlSessionFactory(@Qualifier("ds2DataSource") DataSource dataSource) throws Exception {
        //MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();  //mybatis-plus
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().
                getResources("classpath*:mapper/kingbase/**/*.xml"));
        return sqlSessionFactory.getObject();
    }

    //事务支持
    @Bean(name = "ds2TransactionManager")
    public DataSourceTransactionManager ds2TransactionManager(@Qualifier("ds2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ds2SqlSessionTemplate")
    public SqlSessionTemplate ds2SqlSessionTemplate(@Qualifier("ds2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
