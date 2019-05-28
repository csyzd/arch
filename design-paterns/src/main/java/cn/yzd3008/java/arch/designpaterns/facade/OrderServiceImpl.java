package cn.yzd3008.java.arch.designpaterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderServiceImpl implements OrderService {

	final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Override
	public void order() {
		logger.debug("=== Start: order()");

		logger.debug("=== Processing order...");

		logger.debug("=== End: order()");
	}

}
