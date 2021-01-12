package cn.kgc.mapper;

import java.util.List;

import cn.kgc.entity.OrderDetail;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDetailMapper {
	Integer addOrderDetail(OrderDetail orderDetail);
	OrderDetail findOrderDetailById(Integer detailId);
	Integer updateOrderDetail(OrderDetail orderDetail);
	List<OrderDetail> findOrderDetailByOrderId(String orderId);
}
