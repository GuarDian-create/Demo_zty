package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.GoodsType;
import org.springframework.stereotype.Repository;



@Repository
public interface GoodsTypeMapper {
	GoodsType findTypeById(Integer id);
	Integer saveGoodsType(GoodsType goodsType);
	Integer deleteGoodsType(Integer id);
	Integer updateGoodsType(GoodsType type);
	/*查询所有手机类型*/
	List<GoodsType> findAllType();
	Integer changeTypeState(Integer state, Integer typeId);
	List<GoodsType> findAllTypeByLikeName(String name);
	List<GoodsType> findAllBySplitPage();
}
