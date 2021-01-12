package cn.kgc.service;


import cn.kgc.entity.Admins;

public interface IAdminService {
	Admins login(String name, String pass);
	Integer updateAdmin(Admins admin);
	Admins findAdminById(Integer id);
}
