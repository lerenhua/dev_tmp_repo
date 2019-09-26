package com.example.web_dev;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    //@ResponseBody
    @RequestMapping("/")
    public JSONObject add(String name, String account, String pwd, UserDO userDO) {
        //UserDO userDO = new UserDO();
        //userDO.setId(1L);
        userDO.setName(name);
        userDO.setAccount(account);
        userDO.setPwd(pwd);
        userDao.save(userDO);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("account", account);
        jsonObject.put("pwd", pwd);
        return jsonObject;//{"name": name, "account":account, "pwd": pwd};
    }
}
