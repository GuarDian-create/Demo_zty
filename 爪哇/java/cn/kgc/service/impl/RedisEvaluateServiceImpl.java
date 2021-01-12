package cn.kgc.service.impl;

import java.util.List;

import cn.kgc.entity.Evaluate;
import cn.kgc.entity.Goods;
import cn.kgc.service.IEvaluateService;
import cn.kgc.service.IGoodsService;
import cn.kgc.service.IRedisEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class RedisEvaluateServiceImpl implements IRedisEvaluateService {
	@Autowired
	private IGoodsService goodsService;
	@Autowired
	private IEvaluateService evaService;


	@Override
	public void RefreshEvaluate(Integer goodsId) {
		Goods goods = goodsService.findById(goodsId);
		List<Evaluate> evaList = evaService.findEvaluateByGoodsId(goodsId);
		goods.setEvaList(evaList);
	}
}
