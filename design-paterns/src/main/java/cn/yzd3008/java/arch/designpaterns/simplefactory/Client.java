package cn.yzd3008.java.arch.designpaterns.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

	final static Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		logger.debug("=== Start: 设计模式 - 简单工厂模式 ===");

		BizService bizService = BizServiceFactory.createBizService(0);
		bizService.validateBiz();

		bizService = BizServiceFactory.createBizService(100);
		bizService.validateBiz();

		logger.debug("=== End: 设计模式 - 简单工厂模式 ===");
	}
}
