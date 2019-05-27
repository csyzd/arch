package cn.yzd3008.java.arch.designpaterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BizServiceImpl1 implements BizService {

	final Logger logger = LoggerFactory.getLogger(BizServiceImpl1.class);

	@Override
	public void validateBiz() {
		logger.debug("=== Start: BizServiceImpl1#validateBiz（） ===");
		logger.debug("Validate Biz 1...");
		logger.debug("=== Start: BizServiceImpl1#validateBiz（） ===");
	}

}
