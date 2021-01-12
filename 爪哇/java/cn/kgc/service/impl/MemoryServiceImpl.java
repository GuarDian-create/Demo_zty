package cn.kgc.service.impl;
/**
 * 与手机内存有关的service实现
 */
import java.util.List;

import cn.kgc.entity.Memory;
import cn.kgc.mapper.MemoryMapper;
import cn.kgc.service.IMemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MemoryServiceImpl implements IMemoryService {
	@Autowired
	private MemoryMapper memoryMapper;
	
	/*查询所有手机内存类型*/
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	@Override
	public List<Memory> finAllMemory() {
		return memoryMapper.findAllMemory();
	}

}
