# labtest
### 需要的资源
### 代码地址： http://git.soyomics.com:9000/xiongle/labtest.git
1. MySQL8.O+
   ```bash
       IP:     172.168.1.209 
       PORT:   33075
       UNAME:  root
       PASSWD: Gooalgene@33075
    ```
2. JDK1.8+
   ```bash
   接口请求demo：
   curl http://localhost:8080/test/hello |python -m json.tool
   ```
3. Vue3

4. java代码相关
    ```bash
        开发环境程序启动：运行LabtestApplication类的main方法即可
        包(src/main/java/下)：
            总路径：com.gooalgene.labtest
            web层：controller（rest风格）
                web层（后台管理）：admin
            服务层：service
            持久层：dao
            实体：entity
            返回类型：response（controller中返回使用）
            工具类：util
            配置类：config
        资源目录(src/main/resources)：
            在resources下，application.yml为默认配置文件，里面是数据库连接等信息，若要区分环境，
            则叫application-xx.yml(此时在application.yml中只指定spring.profiles.active:xx);
            mybatis-config.xml为mybatis相应配置，mapper目录下为dao的映射xml文件
        test目录(src/test)：
            放置junit测试类，每一个dao和service都需要经过junit单元测试
        
        
    ```
