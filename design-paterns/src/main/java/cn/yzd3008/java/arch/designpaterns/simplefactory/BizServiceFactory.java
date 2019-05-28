package cn.yzd3008.java.arch.designpaterns.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BizServiceFactory {

	final static Logger logger = LoggerFactory.getLogger(BizServiceFactory.class);

	private BizServiceFactory() {
	}

	public static BizService createBizService(int selectCondition) {
		BizService bizService = null;

		logger.debug("=== Start: BizServiceFactory#createBizService(" + selectCondition + ")");

		if (selectCondition == 0) {
			bizService = new BizServiceImpl1();
		} else {
			bizService = new BizServiceImpl2();
		}

		logger.debug("=== End: BizServiceFactory#createBizService");

		return bizService;
	}
}
