package com.test;
import com.joolun.JooLunWxApplication;
import com.joolun.common.core.domain.AjaxResult;
import com.joolun.common.core.domain.entity.SysUser;
import com.joolun.web.controller.system.Utils;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JooLunWxApplication.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestUtils {

    @Resource
    private Utils utils;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testAdd(){
        int count = utils.add(1,2);
        System.out.println("结果是：" + count);
    }

    @Test
    public void testMultiplication(){
        int count = utils.multiplication(2,3);
        System.out.println("结果是：" + count);
    }

    @Test
    public void testShuixianhuashu(){
        utils.shuixianhuashu();
    }

//    @Test
//    public void testList(){
//        String url = "http://localhost/system/user?userId=1";
//        AjaxResult forObject = testRestTemplate.getForObject(url, AjaxResult.class);
//        System.out.println(forObject.toString());
//    }
}
