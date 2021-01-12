package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.Cart;
import org.springframework.stereotype.Repository;


@Repository
public interface CartMapper {
	Cart findCartById(Integer id);
	Integer addCart(Cart cart);
	Integer deleteCart(Integer cartId);
	Integer updateCart(Cart cart);
	List<Cart> findCartListByUserId(Integer userId);
	Cart findCartByUserId(Integer userId, Integer goodsId);
}
