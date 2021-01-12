package cn.kgc.service;

import java.util.List;

import cn.kgc.entity.GoodsType;
import com.github.pagehelper.PageInfo;


public interface IGoodsTypeService {
	/*查询所有手机类型*/
	List<GoodsType> findAllType();
	
	PageInfo<GoodsType> findTypeBySplitPage(Integer page, Integer limit, String keyword);

	Integer updateGoodsType(GoodsType type);

	Integer addGoodsType(GoodsType type);

	Integer changeTypeState(Integer state, Integer typeId);
	
	Integer deleteGoodsType(Integer typeId);
}
