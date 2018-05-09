package cn.video110.ressadnatomdemo.wcmgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WcmgroupController {
    @Autowired
    WcmgroupRepository wcmgroupRepository;

    @GetMapping("/wcmgroup/findAll")
    public List<WCMGROUP> findAll() {
        return wcmgroupRepository.findAll();
    }
}