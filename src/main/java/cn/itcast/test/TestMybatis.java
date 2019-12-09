package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: cdf
 * @create: 2019-12-09 20:16
 **/
public class TestMybatis {

    @Test
    public void test2() throws IOException {
        //加载配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建sqlsessionfactory工厂对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);

        //创建sqlsession对象
        SqlSession session=factory.openSession();

        //获取到代理对象
        AccountDao dao=session.getMapper(AccountDao.class);

        //查询所有数据
        List<Account> list=dao.findAll();
        for(Account account:list){
            System.out.println(account);
        }

        //关闭资源
        session.close();
        in.close();
    }


    @Test
    public void test3() throws IOException {
        Account account=new Account();
        account.setName("陈登峰");
        account.setMoney(180.0);
        //加载配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建sqlsessionfactory工厂对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);

        //创建sqlsession对象
        SqlSession session=factory.openSession();

        //获取到代理对象
        AccountDao dao=session.getMapper(AccountDao.class);

        //查询所有数据
        dao.saveAccount(account);

        //提交事务
        session.commit();

        //关闭资源
        session.close();
        in.close();
    }


}
