package cn.yzd3008.java.arch.designpaterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingServiceImpl implements ShippingService {

	final Logger logger = LoggerFactory.getLogger(ShippingServiceImpl.class);

	@Override
	public void ship() {

		logger.debug("=== Start: ship()");

		logger.debug("=== Processing shipping...");

		logger.debug("=== End: ship()");
	}

}
