package cn.video110.ressadnatomdemo.wcmuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WcmuserServiceImpl implements WcmuserService {
    @Autowired
    WcmuserRepository wcmuserRepository;

    @Override
    public List<WCMUSER> findByUSERIDIn(List<Integer> userIdList) {
        return wcmuserRepository.findByUSERIDIn(userIdList);
    }
}
