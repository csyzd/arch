package cn.yzd3008.java.arch.designpaterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

	final static Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		logger.debug("=== Start: 设计模式 - 简单工厂模式 ===");

		BizServiceFactory factory = BizServiceFactory.getInstance();

		BizService bizService = factory.getBizService(0);
		bizService.validateBiz();

		bizService = factory.getBizService(100);
		bizService.validateBiz();

		logger.debug("=== End: 设计模式 - 简单工厂模式 ===");
	}
}
