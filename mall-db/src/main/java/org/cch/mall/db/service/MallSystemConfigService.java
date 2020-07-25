package org.cch.mall.db.service;

import org.cch.mall.db.dao.MallSystemMapper;
import org.cch.mall.db.domain.MallSystem;
import org.cch.mall.db.domain.MallSystemExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MallSystemConfigService {
    @Resource
    private MallSystemMapper systemMapper;

    public Map<String, String> queryAll() {
        MallSystemExample example = new MallSystemExample();
        example.or().andDeletedEqualTo(false);

        List<MallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> systemConfigs = new HashMap<>();
        for (MallSystem item : systemList) {
            systemConfigs.put(item.getKeyName(), item.getKeyValue());
        }

        return systemConfigs;
    }

    public Map<String, String> listMail() {
        MallSystemExample example = new MallSystemExample();
        example.or().andKeyNameLike("mall_mall_%").andDeletedEqualTo(false);
        List<MallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(MallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listWx() {
        MallSystemExample example = new MallSystemExample();
        example.or().andKeyNameLike("mall_wx_%").andDeletedEqualTo(false);
        List<MallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(MallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listOrder() {
        MallSystemExample example = new MallSystemExample();
        example.or().andKeyNameLike("mall_order_%").andDeletedEqualTo(false);
        List<MallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(MallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public Map<String, String> listExpress() {
        MallSystemExample example = new MallSystemExample();
        example.or().andKeyNameLike("mall_express_%").andDeletedEqualTo(false);
        List<MallSystem> systemList = systemMapper.selectByExample(example);
        Map<String, String> data = new HashMap<>();
        for(MallSystem system : systemList){
            data.put(system.getKeyName(), system.getKeyValue());
        }
        return data;
    }

    public void updateConfig(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            MallSystemExample example = new MallSystemExample();
            example.or().andKeyNameEqualTo(entry.getKey()).andDeletedEqualTo(false);

            MallSystem system = new MallSystem();
            system.setKeyName(entry.getKey());
            system.setKeyValue(entry.getValue());
            system.setUpdateTime(LocalDateTime.now());
            systemMapper.updateByExampleSelective(system, example);
        }

    }

    public void addConfig(String key, String value) {
        MallSystem system = new MallSystem();
        system.setKeyName(key);
        system.setKeyValue(value);
        system.setAddTime(LocalDateTime.now());
        system.setUpdateTime(LocalDateTime.now());
        systemMapper.insertSelective(system);
    }
}
