package cn.yzd3008.java.arch.designpaterns.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BizServiceImpl2 implements BizService {

	final Logger logger = LoggerFactory.getLogger(BizServiceImpl2.class);

	@Override
	public void validateBiz() {
		logger.debug("=== Start: BizServiceImpl2#validateBiz（） ===");
		logger.debug("Validate Biz 2...");
		logger.debug("=== End: BizServiceImpl2#validateBiz（） ===");
	}

}
