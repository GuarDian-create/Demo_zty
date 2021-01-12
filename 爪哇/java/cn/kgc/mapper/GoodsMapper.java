package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Goods;
import org.springframework.stereotype.Repository;



@Repository
public interface GoodsMapper {
	List<Goods> findAllBaseData();
	List<Goods> findAll();
	Integer saveGoods(Goods goods);
	Integer deleteGoods(Integer goods);
	Integer updateGoods(Goods goods);
	Goods findGoodsById(Integer id);
	List<Goods> findGoodsByType(Integer typeId);
	List<Goods> findHotGoods(Integer num);
	List<Goods> findGoodsLikeName(String name);
	List<Goods> findGoodsByVolume(Integer limit);
}
