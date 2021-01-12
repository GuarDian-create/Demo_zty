package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Areas;
import org.springframework.stereotype.Repository;



@Repository
public interface AreasMapper {
	List<Areas> findAreasByCityId(String cityId);
	Areas findAreaByAreaName(String name, String cityId);
	Areas findAreaById(String id);
}
