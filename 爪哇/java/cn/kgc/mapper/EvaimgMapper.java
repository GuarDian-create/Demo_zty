package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Evaimg;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaimgMapper {
	Integer addEvaimg(Evaimg evaimg);
	Evaimg findEvaimgById(Integer id);
	List<Evaimg> findEvaimgByEvaId(Integer evaId);
}
