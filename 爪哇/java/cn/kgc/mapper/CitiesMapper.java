package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Cities;
import org.springframework.stereotype.Repository;



@Repository
public interface CitiesMapper {
	List<Cities> findCitiesByProvinceId(String provinceId);
	Cities findCityByCityName(String name, String provinceId);
	Cities findCityById(String id);
}
