package com.small.o2o.comp.obgenerator;/*
package com.cppic.obgenerator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class MyBatisPlusGenerator {

    public static void main(String[] args) {
        //全局配置
        GlobalConfig config = new GlobalConfig.Builder()
                //作者
                .author("terry")
                // 生成路径，最好使用绝对路径，window路径是不一样的
                .outputDir("E:\\MyBatisPlusGenerator")
                // 文件覆盖
                .fileOverride()
                //设置时间对应类型
                .dateType(DateType.ONLY_DATE)
                .build();

        //包名策略配置
        PackageConfig packageConfig = new PackageConfig.Builder()
                .parent("com.fnd.businessvehicleintelligent.risksurvey")
                .mapper("mapper")
                .service("service")
                .controller("")
                .entity("entity")
                .xml("mapper")
                .build();

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                //设置需要映射的表名
                .addInclude("FACTOR_TEMPLATE")
                //策略开启⼤写命名
                .enableCapitalMode()
                .entityBuilder()
                //添加后缀
                //.formatFileName("%sDO")
                //添加lombock的getter、setter注解
                //.enableLombok()
                // 数据库表映射到实体的命名策略
                .columnNaming(NamingStrategy.underline_to_camel)
                .naming(NamingStrategy.underline_to_camel)
                .mapperBuilder()//mapper类添加@Mapper
                //生成基本的SQL片段
                .enableBaseColumnList()
                //生成基本的resultMap
                .enableBaseResultMap()
                .serviceBuilder()
                //添加后缀
                .formatServiceFileName("%sService")
                //使用restcontroller注解
                .controllerBuilder().enableRestStyle()
                .entityBuilder().enableTableFieldAnnotation()//开启生成实体时生成字段注解
                .build();

        // 数据源配置
        DataSourceConfig.Builder dataSourceConfigBuilder = new DataSourceConfig
                .Builder(
                "jdbc:oceanbase:oracle://29.30.194.204:2883/autocv?useUnicode=true&characterEncoding=utf-8&rewriteBatchedStatements=true&allowMultiQueries=true",
                "autocv@property_pt22cvm_autocv_dev#cx_x86_obdev:1649233511",
                "Ce_Sh1%Pa2s_obdb");

        // 创建代码生成器对象，加载配置
        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfigBuilder.build());
        autoGenerator.global(config);
        autoGenerator.packageInfo(packageConfig);
        autoGenerator.strategy(strategyConfig);

        //执行操作
        autoGenerator.execute();
        System.out.println("=======  Done 相关代码生成完毕  ========");

    }

}
*/
