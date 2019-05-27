package cn.yzd3008.java.arch.designpaterns;

public class BizServiceFactory {

	private static BizServiceFactory bizServiceFactory;

	private BizServiceFactory() {
	}

	public static synchronized BizServiceFactory getInstance() {
		if (bizServiceFactory == null) {
			bizServiceFactory = new BizServiceFactory();
		}

		return bizServiceFactory;
	}

	public BizService getBizService(int selectCondition) {
		BizService bizService = null;

		if(selectCondition == 0) {
			bizService = new BizServiceImpl1();
		}else {
			bizService = new BizServiceImpl2();
		}
		
		return bizService;
	}
}
