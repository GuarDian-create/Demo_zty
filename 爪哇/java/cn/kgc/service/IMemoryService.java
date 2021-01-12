package cn.kgc.service;
/**
 * 与手机内存有关的service接口
 */
import cn.kgc.entity.Memory;

import java.util.List;



public interface IMemoryService {
	/*查询所有手机内存类型*/
	List<Memory> finAllMemory();
}
