package org.cch.mall.wx.service;

import org.cch.mall.db.domain.MallRegion;
import org.cch.mall.db.service.MallRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhy
 * @date 2019-01-17 23:07
 **/
@Component
public class GetRegionService {

	@Autowired
	private MallRegionService regionService;

	private static List<MallRegion> MallRegions;

	protected List<MallRegion> getMallRegions() {
		if(MallRegions==null){
			createRegion();
		}
		return MallRegions;
	}

	private synchronized void createRegion(){
		if (MallRegions == null) {
			MallRegions = regionService.getAll();
		}
	}
}
