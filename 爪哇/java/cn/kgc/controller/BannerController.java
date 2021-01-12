package cn.kgc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import cn.kgc.entity.Banner;
import cn.kgc.entity.GoodsType;
import cn.kgc.service.IBannerService;
import cn.kgc.service.IGoodsTypeService;
import cn.kgc.util.UUIDUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/banner")
public class BannerController {
	@Autowired
	private IBannerService bannerService;
	@Autowired
	private IGoodsTypeService typeService;
	@RequestMapping("findAllBannerBySplitPage")
	@ResponseBody
	public JSONObject findAllBanner(Integer page,Integer limit,String keyword){
		PageInfo<Banner> info = bannerService.findAllBannerBySplitePage(page, limit,keyword);
		JSONObject obj=new JSONObject();
		obj.put("code", 0);
		obj.put("msg", "");
		obj.put("data", info.getList());
		obj.put("count",info.getTotal());
		return obj;
	}

	@RequestMapping("test")
	@ResponseBody
	public List<Banner> test(){
		List<Banner> bannerList = bannerService.findAllShowBanner();
		return bannerList;
	}

	@RequestMapping("test2")
	@ResponseBody
	public List<GoodsType> test2(){
		List<GoodsType> typeList = typeService.findAllType();
		return typeList;
	}

	@RequestMapping("updateBanner")
	@ResponseBody
	public String updateBanner(Banner banner){
		Integer rs = bannerService.updateBanner(banner);
		if(rs>0){
			return "success";
		}else{
			return "fail";
		}
	}
	@RequestMapping(value="uploadBannerImg",method={RequestMethod.POST})
	@ResponseBody
	public JSONObject uploadBannerImg(@PathVariable(value="file")MultipartFile file,HttpServletRequest request){
		String originalFilename = file.getOriginalFilename();
		String name= UUIDUtil.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
		String path=request.getServletContext().getRealPath("/upload")+"/"+name;
		try {
			file.transferTo(new File(path));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		JSONObject obj=new JSONObject();
		obj.put("src", name);
		return obj;
	}
	@RequestMapping("changeBannerState")
	@ResponseBody
	public String changeBannerState(Integer state,Integer bannerId){
		Integer rs = bannerService.changeBannerState(state, bannerId);
		if(rs>0){
			return "success";
		}else{
			return "fail";
		}
	}
	@RequestMapping("deleteBanner")
	@ResponseBody
	public String deleteBanner(Integer bannerId){
		Integer rs = bannerService.deleteBanner(bannerId);
		if(rs>0){
			return "success";
		}else{
			return "fail";
		}
	}
	@RequestMapping("batchDelete")
	@ResponseBody
	public String batchDelete(String batchId){
		String[] list = batchId.split(",");
		boolean flag=true;
		for (String id : list) {
			Integer bannerId = Integer.valueOf(id);
			Integer rs = bannerService.deleteBanner(bannerId);
			if(rs<0){
				flag=false;
			}
		}
		if(flag){
			return "success";
		}else{
			return "fail";
		}
	}
	@RequestMapping("addBanner")
	@ResponseBody
	public String addBanner(Banner banner){
		Integer rs = bannerService.addBanner(banner);
		if(rs>0){
			return "success";
		}else{
			return "fail";
		}
	}
}
