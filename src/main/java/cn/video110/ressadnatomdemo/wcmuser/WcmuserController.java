package cn.video110.ressadnatomdemo.wcmuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WcmuserController {

    @Autowired
    WcmuserService wcmuserService;

    @GetMapping("/wcmuser/findByUserId")
    public List<WCMUSER> findByUSERID(@RequestParam(value = "userIdList[]") List<Integer> userIdList) {
        return wcmuserService.findByUSERIDIn(userIdList);
    }
}