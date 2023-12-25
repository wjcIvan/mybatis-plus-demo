package com.example.mybatisplusdemo.config;


import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.TenantLineInnerInterceptor;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.mybatisplusdemo")
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 添加多租户Interceptor后出现问题，
        // com.baomidou.mybatisplus.extension.parser.JsqlParserGlobal.parseStatements 将包含多个换行的sql分割成了两个sql
        // CCJSqlParserUtil.parseStatements(java.lang.String)
        interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandler() {
            @Override
            public Expression getTenantId() {
                return new LongValue(0);
            }
            @Override
            public String getTenantIdColumn(){
                return "test";
            }
            @Override
            public boolean ignoreTable(String tableName) {
                return true;
            }
        }));
        return interceptor;
    }

}
