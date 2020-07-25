package org.cch.mall.wx.service;

import org.cch.mall.db.domain.MallUser;
import org.cch.mall.db.service.MallUserService;
import org.cch.mall.wx.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserInfoService {
    @Autowired
    private MallUserService userService;


    public UserInfo getInfo(Integer userId) {
        MallUser user = userService.findById(userId);
        Assert.state(user != null, "用户不存在");
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(user.getNickname());
        userInfo.setAvatarUrl(user.getAvatar());
        return userInfo;
    }
}
