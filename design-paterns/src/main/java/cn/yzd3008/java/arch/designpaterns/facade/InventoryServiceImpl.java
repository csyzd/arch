package cn.yzd3008.java.arch.designpaterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InventoryServiceImpl implements InventoryService {

	final Logger logger = LoggerFactory.getLogger(InventoryServiceImpl.class);

	@Override
	public void subtractProduct(int quantity) {

		logger.debug("=== Start: InventoryServiceImpl(" + quantity + ")");

		logger.debug("=== Processing inventory...");

		logger.debug("=== End: InventoryServiceImpl");
	}

}
