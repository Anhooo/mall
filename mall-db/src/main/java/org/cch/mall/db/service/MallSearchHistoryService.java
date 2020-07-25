package org.cch.mall.db.service;

import com.github.pagehelper.PageHelper;
import org.cch.mall.db.dao.MallSearchHistoryMapper;
import org.cch.mall.db.domain.MallSearchHistory;
import org.cch.mall.db.domain.MallSearchHistoryExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MallSearchHistoryService {
    @Resource
    private MallSearchHistoryMapper searchHistoryMapper;

    public void save(MallSearchHistory searchHistory) {
        searchHistory.setAddTime(LocalDateTime.now());
        searchHistory.setUpdateTime(LocalDateTime.now());
        searchHistoryMapper.insertSelective(searchHistory);
    }

    public List<MallSearchHistory> queryByUid(int uid) {
        MallSearchHistoryExample example = new MallSearchHistoryExample();
        example.or().andUserIdEqualTo(uid).andDeletedEqualTo(false);
        example.setDistinct(true);
        return searchHistoryMapper.selectByExampleSelective(example, MallSearchHistory.Column.keyword);
    }

    public void deleteByUid(int uid) {
        MallSearchHistoryExample example = new MallSearchHistoryExample();
        example.or().andUserIdEqualTo(uid);
        searchHistoryMapper.logicalDeleteByExample(example);
    }

    public List<MallSearchHistory> querySelective(String userId, String keyword, Integer page, Integer size, String sort, String order) {
        MallSearchHistoryExample example = new MallSearchHistoryExample();
        MallSearchHistoryExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(userId)) {
            criteria.andUserIdEqualTo(Integer.valueOf(userId));
        }
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andKeywordLike("%" + keyword + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return searchHistoryMapper.selectByExample(example);
    }
}
