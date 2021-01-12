package cn.kgc.service.impl;

import java.util.List;

import cn.kgc.entity.Admins;
import cn.kgc.mapper.AdminsMapper;
import cn.kgc.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private AdminsMapper adminsMapper;
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public Admins login(String name, String pass) {
		List<Admins> list = adminsMapper.findAdminByName(name);
		for (Admins a : list) {
			if(a.getAdminPass().equals(pass)){
				return a;
			}
		}
		return null;
	}
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public Integer updateAdmin(Admins admin) {
		return adminsMapper.updateAdmin(admin);
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public Admins findAdminById(Integer id) {
		return adminsMapper.findAdminById(id);
	}
}
