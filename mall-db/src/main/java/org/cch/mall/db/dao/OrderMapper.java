package org.cch.mall.db.dao;

import org.apache.ibatis.annotations.Param;
import org.cch.mall.db.domain.MallOrder;

import java.time.LocalDateTime;

public interface OrderMapper {
    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") MallOrder order);
}