package cn.kgc.service;

import java.util.List;

import cn.kgc.entity.Address;
import cn.kgc.entity.Areas;
import cn.kgc.entity.Cities;
import cn.kgc.entity.Provinces;
import org.springframework.stereotype.Service;



/**
 * @author 张贤
 *
 */
public interface IAddressService {
	List<Address> findAddressByUserId(Integer userId);
	Address findAddresById(Integer id);
	Provinces findProByProByName(String name);
	Cities findCityByCityName(String name, String provinceId);
	Areas findAreaByAreaName(String name, String cityId);
	Integer addAddress(Address addr);
	Integer updateAddress(Address addr);
	Integer deleteAddress(Integer addrId);
}
