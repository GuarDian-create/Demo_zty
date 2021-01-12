package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@RequestMapping("register")
	public String toRegister(){
		return "register";
	}
	
	@RequestMapping("login")
	public String toLogin(){
		return "login";
	}
	

	@RequestMapping("goodsList")
	public String pathControl(){
		return "goodslist";
	}
	@RequestMapping("addGoods")
	public String toAddGoods(){
		return "goodsadd";
	}
	@RequestMapping("usercenter")
	public String toUserCenter(){
		return "usercenter";
	}
	@RequestMapping("index")
	public String toIndex(){
		return "index";
	}
	@RequestMapping("cart")
	public String toCart(){
		return "shopping_cart";
	}
	@RequestMapping("admin")
	public String toAdmin(){
		return "adminlogin";
	}
	@RequestMapping("orderlist")
	public String toOrderList(){
		return "orderlist";
	}
	@RequestMapping("userlist")
	public String toUserList(){
		return "userlist";
	}
	@RequestMapping("bannerlist")
	public String toBannerList(){
		return "bannerlist";
	}
	@RequestMapping("addbanner")
	public String toAddBanner(){
		return "banneradd";
	}
	@RequestMapping("evaluate")
	public String toEva(){
		return "evaluate";
	}
	@RequestMapping("evalist")
	public String toEvalist(){
		return "evalist";
	}
	@RequestMapping("welcome")
	public String toWelcome(){
		return "welcome";
	}
	@RequestMapping("toAdminIndex")
	public String toAdminIndex(){
		return "adminindex";
	}
	@RequestMapping("admininfo")
	public String adminInfo(){
		return "info";
	}
	@RequestMapping("updatepass")
	public String updatePass(){
		return "updatepass";
	}
	@RequestMapping("typelist")
	public String toTypeList(){
		return "typelist";
	}
}
