package org.cch.mall.wx.web;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cch.mall.core.util.RegexUtil;
import org.cch.mall.core.util.ResponseUtil;
import org.cch.mall.db.domain.MallFeedback;
import org.cch.mall.db.domain.MallUser;
import org.cch.mall.db.service.MallFeedbackService;
import org.cch.mall.db.service.MallUserService;
import org.cch.mall.wx.annotation.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 意见反馈服务
 *
 * @author Yogeek
 * @date 2018/8/25 14:10
 */
@RestController
@RequestMapping("/wx/feedback")
@Validated
public class WxFeedbackController {
    private final Log logger = LogFactory.getLog(WxFeedbackController.class);

    @Autowired
    private MallFeedbackService feedbackService;
    @Autowired
    private MallUserService userService;

    private Object validate(MallFeedback feedback) {
        String content = feedback.getContent();
        if (StringUtils.isEmpty(content)) {
            return ResponseUtil.badArgument();
        }

        String type = feedback.getFeedType();
        if (StringUtils.isEmpty(type)) {
            return ResponseUtil.badArgument();
        }

        Boolean hasPicture = feedback.getHasPicture();
        if (hasPicture == null || !hasPicture) {
            feedback.setPicUrls(new String[0]);
        }

        // 测试手机号码是否正确
        String mobile = feedback.getMobile();
        if (StringUtils.isEmpty(mobile)) {
            return ResponseUtil.badArgument();
        }
        if (!RegexUtil.isMobileExact(mobile)) {
            return ResponseUtil.badArgument();
        }
        return null;
    }

    /**
     * 添加意见反馈
     *
     * @param userId   用户ID
     * @param feedback 意见反馈
     * @return 操作结果
     */
    @PostMapping("submit")
    public Object submit(@LoginUser Integer userId, @RequestBody MallFeedback feedback) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        Object error = validate(feedback);
        if (error != null) {
            return error;
        }

        MallUser user = userService.findById(userId);
        String username = user.getUsername();
        feedback.setId(null);
        feedback.setUserId(userId);
        feedback.setUsername(username);
        //状态默认是0，1表示状态已发生变化
        feedback.setStatus(1);
        feedbackService.add(feedback);

        return ResponseUtil.ok();
    }

}
