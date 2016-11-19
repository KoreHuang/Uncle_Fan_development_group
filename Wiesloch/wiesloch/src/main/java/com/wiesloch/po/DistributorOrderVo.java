package com.wiesloch.po;

/**
 * ClassName:DistributorOrderVo<br/>
 * Description:分销商订单最终视图类，通过这个类来显示，或者通过它接收信息<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午4:19:50 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class DistributorOrderVo {
	private DistributorOrderExtend distributorOrderExtend;

	public DistributorOrderExtend getDistributorOrderExtend() {
		return distributorOrderExtend;
	}

	public void setDistributorOrderExtend(DistributorOrderExtend distributorOrderExtend) {
		this.distributorOrderExtend = distributorOrderExtend;
	}

}
