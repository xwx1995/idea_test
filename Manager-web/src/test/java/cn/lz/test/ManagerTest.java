package cn.lz.test;

import cn.lz.mapper.UsersMapper;
import cn.lz.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void insertUsersTest(){
        Users users = new Users();
        users.setUserage(20);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);
    }

}
