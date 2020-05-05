package study.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.boot.mapper.UsersMapper;
import study.boot.vo.UsersVO;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {
    @Resource
    UsersMapper usersMapper;

    @RequestMapping(path = "/")
    public String hello() {
        return "MyBatis + MySQL";
    }

    @RequestMapping("/mysql")
    public Map<String, Object> dbConnection(){
        List<UsersVO> list = usersMapper.findAll();

        Map<String, Object> result = new HashMap<>();
        result.put("list", list);
        return result;
    }
}
