package com.springnovel.paymentwithoutspring;

import com.springnovel.dao.IOrderDao;
import com.springnovel.dao.OrderDao;

public class OrderAction {
	public void deleteOrder(String orderId) {
		// ��Ȩ
		// �˴���ȥһ����...
		
		IOrderDao orderDao = new OrderDao();
		orderDao.deleteOrder(orderId);
	}
}
