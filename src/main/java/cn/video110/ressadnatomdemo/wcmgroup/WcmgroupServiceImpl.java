package cn.video110.ressadnatomdemo.wcmgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WcmgroupServiceImpl implements WcmgroupService {
    @Autowired
    WcmgroupRepository wcmgroupRepository;

    @Override
    public List<WCMGROUP> findAll() {
        return wcmgroupRepository.findAll();
    }
}
