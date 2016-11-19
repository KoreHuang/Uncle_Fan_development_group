package com.wiesloch.mapper;

import java.util.List;

import com.wiesloch.po.Goods;

/**
 * ClassName:GoodsMapper<br/>
 * Description:商品操作类<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午7:38:27 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public interface GoodsMapper {
	/**
	 * 查询商品分类
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsType() throws Exception;

	/**
	 * 查询分类下商品信息
	 * 
	 * @param pid
	 *            商品的父id
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsByPid(Integer pid) throws Exception;

	/**
	 * 通过名字查找商品
	 * 
	 * @param name
	 *            查找的名字
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsByName(String name) throws Exception;

	/**
	 * 通过商品id查询具体的商品信息
	 * 
	 * @param id
	 *            商品的id
	 * @return
	 * @throws Exception
	 */
	public Goods selectGoodsById(Integer id) throws Exception;
	
	
	/**
	 * 
	 * @param status 商品状态
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsByStatus(String status) throws Exception;
}
