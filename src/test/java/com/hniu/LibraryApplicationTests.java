package com.hniu;

import com.hniu.entity.Admin;
import com.hniu.entity.vo.PermissionsVo;
import com.hniu.mapper.AdminMapper;
import com.hniu.mapper.PermissionsMapper;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationTests {

    @Autowired
    PermissionsMapper pm;

    @Test
    public void hello(){
        System.out.println(pm.test());
        List<PermissionsVo> test = pm.test();

    }
}
