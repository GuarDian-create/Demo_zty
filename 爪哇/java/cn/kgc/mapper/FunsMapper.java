package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Funs;
import org.springframework.stereotype.Repository;



@Repository
public interface FunsMapper {
	Funs findFunsById(Integer id);
	List<Funs> findFunsByPid(Integer id);
	List<Funs> findAllFuns();
	List<Funs> findFunsByRoleId(Integer roleId);
}
