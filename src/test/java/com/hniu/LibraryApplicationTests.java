package com.hniu;

import com.hniu.entity.Admin;
import com.hniu.mapper.AdminMapper;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationTests {

    @Autowired
    AdminMapper am;

    @Test
    public void hello(){
    }
}
