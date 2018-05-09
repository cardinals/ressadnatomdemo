package cn.video110.ressadnatomdemo.wcmuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WcmuserController {

    @Autowired
    WcmuserRepository wcmuserRepository;

    @GetMapping("/wcmuser/findByUserId")
    public List<WCMUSER> findByUSERID(Integer userId) {
        return wcmuserRepository.findByUSERID(userId);
    }
}