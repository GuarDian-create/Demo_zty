package cn.kgc.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


import cn.kgc.entity.Banner;
import cn.kgc.service.IBannerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BannerListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		IBannerService bannerService = app.getBean(IBannerService.class);
		ServletContext application = arg0.getServletContext();
		List<Banner> bannerList = bannerService.findAllShowBanner();
		application.setAttribute("bannerList", bannerList);
	}

}
