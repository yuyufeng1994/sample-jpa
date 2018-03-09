package top.yuyufeng.sample.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.yuyufeng.sample.domain.UserInfo;

/**
 * @author yuyufeng
 * @date 2018/3/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class UserInfoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("用户123");
        userDao.save(userInfo);
        System.out.println(userInfo);
    }
}
