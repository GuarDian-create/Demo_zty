package cn.kgc.service;


import cn.kgc.entity.Users;
import com.github.pagehelper.PageInfo;

public interface IUserService {
	
	Users login(String userName, String userPass);

	Integer updateUserInfo(Users user);
	Users findUserById(Integer id);
	PageInfo<Users> findAllUsersBySplitPage(Integer page, Integer limit, String keyword);
	Integer changeUserState(Integer state, Integer userId);
	Integer deleteUser(Integer userId);
	Integer addUser(Users user);
}
