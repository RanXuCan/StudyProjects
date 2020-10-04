package com.rxc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 获取mybatis的sqlSession实例
 * @Author RanXuCan
 * @Date 2020/9/30 14:44
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private static InputStream inputStream;

    static {
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static synchronized SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
