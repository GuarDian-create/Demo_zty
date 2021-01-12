package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Provinces;
import org.springframework.stereotype.Repository;



@Repository
public interface ProvincesMapper {
	List<Provinces> findAllProvince();
	
	Provinces findProByProName(String name);
	
	Provinces findProByProId(String id);
}
