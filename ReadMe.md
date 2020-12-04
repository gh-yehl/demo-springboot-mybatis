
Demo Project - SpringBoot Integrate with MyBatis(No XML - Pure AutoConfigue) and Druid

1 - Integrate with MyBatis
    1) 依赖
            <parent>
                <artifactId>spring-boot-starter-data-jpa</artifactId>
                <groupId>org.springframework.boot</groupId>
                <version>2.0.1.RELEASE</version>
            </parent>
            
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-web</artifactId>
                    </dependency>
            
                    <!-- https://mvnrepository.com/artifact/org.mybatis.spring.boot/mybatis-spring-boot-starter -->
                    <dependency>
                        <groupId>org.mybatis.spring.boot</groupId>
                        <artifactId>mybatis-spring-boot-starter</artifactId>
                        <version>2.0.1</version>
                    </dependency>
            
                    <!-- 引入 mysql 实现 -->
                    <dependency>
                        <groupId>mysql</groupId>
                        <artifactId>mysql-connector-java</artifactId>
                        <version>8.0.17</version>
                    </dependency>
    2) application.properties
    server.port=8080
    spring.application=demo-springboot-mybatis
    
    spring.datasource.url=jdbc:mysql://www.curvelife.cn:3306/springcore?characterEncoding=utf8
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=123456


2 - Integrate Ali-Druid
    1) 依赖
            <!-- https://mvnrepository.com/artifact/com.alibaba/druid-spring-boot-starter -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid-spring-boot-starter</artifactId>
                <version>1.1.16</version>
            </dependency>
    2) 配置
        a: DruidConfig.Java
        b: Properties file
        
        ##########################  druid??   ##########################
        #spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
        #?????
        spring.datasource.maxActive=20
        #?????
        spring.datasource.initialSize=5
        #?????
        spring.datasource.minIdle=5
        #????????
        spring.datasource.maxWait=60000
        #???????????????????????????????
        spring.datasource.timeBetweenEvictionRunsMillis=60000
        #??????????????????????
        spring.datasource.minEvictableIdleTimeMillis=300000
        spring.datasource.validationQuery=SELECT 1 FROM t_user
        spring.datasource.testWhileIdle=true
        spring.datasource.testOnBorrow=false
        spring.datasource.exceptionSorter=true
        spring.datasource.testOnReturn=false
        #??PSCache??????????PSCache???
        spring.datasource.poolPreparedStatements=true
        spring.datasource.maxPoolPreparedStatementPerConnectionSize=20
        #?????????filters????????sql?????'wall'?????
        spring.datasource.filters=stat,wall
        #??connectProperties?????mergeSql????SQL??
        spring.datasource.connectionProperties=druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500
        #????DruidDataSource?????
        spring.datasource.useGlobalDataSourceStat=true
    
3 - 建立表及准备数据

    CREATE TABLE `user` (
      `role_id` int(11) NOT NULL,
      `user_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
      `gender` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
      `age` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
      PRIMARY KEY (`role_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
    
    INSERT INTO `role` VALUES (111,'roleName','Note111');
    
    CREATE TABLE `role` (
      `id` bigint(20) NOT NULL,
      `role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
      `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
    
    INSERT INTO `user` VALUES (111,'Dave','Male','28'),(222,'Kathy','male','33'),(333,'Chris','male','40');


