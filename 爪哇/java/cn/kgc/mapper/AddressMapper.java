package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Address;
import org.springframework.stereotype.Repository;



@Repository
public interface AddressMapper {
	Integer addAddress(Address addr);
	Integer deleteAddr(Integer addrId);
	Integer updateAddr(Address addr);
	Address findAddrById(Integer id);
	List<Address> findAddrByUserId(Integer userId);
}
