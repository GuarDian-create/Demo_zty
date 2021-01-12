package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Role;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleMapper {
	Role findById(Integer id);
	List<Role> findAllRole();
	Role findRolesFunsById(Integer roleId);
}
