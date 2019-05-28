package cn.yzd3008.java.arch.designpaterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BizFacade {
	final Logger logger = LoggerFactory.getLogger(BizFacade.class);

	private InventoryService inventoryService = new InventoryServiceImpl();
	private OrderService orderService = new OrderServiceImpl();
	private ShippingService shippingService = new ShippingServiceImpl();

	public void doBiz() {
		logger.debug("=== Start: ship()");

		logger.debug("=== Processing biz...");
		inventoryService.subtractProduct(236);
		orderService.order();
		shippingService.ship();

		logger.debug("=== End: ship()");
	}
}
