package cn.yzd3008.java.arch.designpaterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

	final static Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		logger.debug("=== Start: 设计模式 - 外观模式 ===");

		BizFacade facade = new BizFacade();
		facade.doBiz();

		logger.debug("=== End: 设计模式 - 外观模式 ===");
	}
}
