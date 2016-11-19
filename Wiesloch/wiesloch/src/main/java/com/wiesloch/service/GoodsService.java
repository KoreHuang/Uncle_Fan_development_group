package com.wiesloch.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wiesloch.mapper.GoodsMapper;
import com.wiesloch.po.Goods;

/**
 * ClassName:GoodsService<br/>
 * Description:<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午7:52:56 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
@Service
@Transactional
public class GoodsService {
	@Resource
	private GoodsMapper goodsMapper;

	/**
	 * 查询商品分类
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsType() throws Exception {
		return goodsMapper.selectGoodsType();
	}

	/**
	 * 查询分类下商品信息
	 * 
	 * @param pid
	 *            商品的父id
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsByPid(Integer pid) throws Exception {
		return goodsMapper.selectGoodsByPid(pid);
	}

	/**
	 * 通过商品名称查找商品
	 * 
	 * @param name
	 *            查找商品的名称
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsByName(String name) throws Exception {
		return goodsMapper.selectGoodsByName(name);
	}

	/**
	 * 通过商品的id查询商品详情
	 * 
	 * @param id
	 *            商品的id
	 * @return
	 * @throws Exception
	 */
	public Goods selectGoodsById(Integer id) throws Exception {
		if (id != null) {
			return goodsMapper.selectGoodsById(id);
		} else {
			return null;
		}
	}

	public List<Goods> selectGoodsByStatus(String status) throws Exception {
		if (status != null) {
			return goodsMapper.selectGoodsByStatus(status);
		} else {
			return null;
		}
	}

}
