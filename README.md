# 说明

执行方法：[MybatisPlusDemoApplicationTests.java](src%2Ftest%2Fjava%2Fcom%2Fexample%2Fmybatisplusdemo%2FMybatisPlusDemoApplicationTests.java)
userMapperTest方法

[pom.xml](pom.xml)文件中

+ mp版本修改为3.5.3.1，正常执行
+ mp版本修改为3.5.3.2，执行报错

[UserMapper.xml](src%2Fmain%2Fresources%2Fmapper%2FUserMapper.xml) 中多行注释会出现问题；
[MybatisPlusConfig.java](src%2Fmain%2Fjava%2Fcom%2Fexample%2Fmybatisplusdemo%2Fconfig%2FMybatisPlusConfig.java)
不使用TenantLineInnerInterceptor则不会出现该问题
