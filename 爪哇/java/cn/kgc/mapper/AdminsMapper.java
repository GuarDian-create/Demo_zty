package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Admins;
import org.springframework.stereotype.Repository;



@Repository
public interface AdminsMapper {
	Admins findAdminById(Integer id);
	Integer addAdmins(Admins admin);
	Integer deleteAdmin(Integer id);
	Integer disableAdmin(Integer id);
	Integer updateAdmin(Admins admin);
	List<Admins> findAllAdmin();
	List<Admins> findAdminByName(String name);
}
