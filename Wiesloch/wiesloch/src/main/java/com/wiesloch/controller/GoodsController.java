package com.wiesloch.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.wiesloch.po.Goods;
import com.wiesloch.service.GoodsService;

/**
 * ClassName:GoodsController<br/>
 * Description:<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午8:30:25 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Resource
	private GoodsService goodsService;

	/**
	 * 查找商品分类
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/selectGoodsType", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView selectGoodsType() throws Exception {
		List<Goods> goodsTypes = goodsService.selectGoodsType();
		List<Goods> goodsList = new ArrayList<Goods>();
		
		for (Goods goods : goodsTypes) {
			
			List<Goods> tempList = goodsService.selectGoodsByPid(goods.getGoods_id());
			for (Goods goods2 : tempList) {
				String [] pictures = goods2.getGoods_pictureUrl().split(";");
				goods2.setPictureUrl(pictures[0]);
				goodsList.add(goods2);
			}
			
		}
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(goodsTypes);
		modelAndView.addObject("goodsList", goodsList);
		modelAndView.addObject("goodsTypes", goodsTypes);
		modelAndView.setViewName("goods/goodsTypes");
		return modelAndView;
	}

	/**
	 * 查找分类下具体的商品
	 * 
	 * @param response
	 * @param pid
	 * @throws Exception
	 */
	@RequestMapping(value = "/selectGoodsByPid", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "text/html;charset=UTF-8")
	public void selectGoodsByPid(HttpServletResponse response, Integer pid) throws Exception {
		response.setCharacterEncoding("utf-8");
		List<Goods> result = goodsService.selectGoodsByPid(pid);
		for (Goods goods : result) {
			String pictures[] = goods.getGoods_pictureUrl().split(";");
			goods.setPictureUrl(pictures[0]);
		}
		String json = JSON.toJSONString(result);
		PrintWriter pw = response.getWriter();
		pw.write(json);
	}

	/**
	 * 实现实时查询
	 * 
	 * @param response
	 * @param name
	 * @throws Exception
	 */
	@RequestMapping(value = "/selectGoodsByName", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "text/html;charset=UTF-8")
	public ModelAndView selectGoodsByName(String name) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if ("".equals(name)) {
			modelAndView.addObject("msg", "搜索内容不能为空");
		} else {
			List<Goods> result = goodsService.selectGoodsByName(name);
			if (result.size() == 0) {
				modelAndView.addObject("msg", "查询结果不存在推荐以下商品");
				List<Goods> groom = goodsService.selectGoodsByStatus("推荐");
				modelAndView.addObject("groom", groom);
			} else {
				modelAndView.addObject("msg", "查询结果");
			}
			modelAndView.addObject("goodses", result);
		}
		modelAndView.setViewName("goods/goodses");
		return modelAndView;
	}

	/**
	 * 根据id查询商品详情
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/selectGoodsById", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView selectGoodsById(Integer id) throws Exception {
		Goods result = goodsService.selectGoodsById(id);
		ModelAndView modelAndView = new ModelAndView();
		if (result == null) {
			modelAndView.setViewName("error.jsp");
		} else {
			String pictures[] = result.getGoods_pictureUrl().split(";");
			modelAndView.addObject("pictrue0", pictures[0]);
			modelAndView.addObject("pictrue1", pictures[1]);
			modelAndView.addObject("pictrue2", pictures[2]);
			modelAndView.addObject("pictrue3", pictures[3]);
			
			modelAndView.addObject("goods", result);
			modelAndView.setViewName("goods/goodsDetail");
		}
		return modelAndView;
	}
	
	
	
	
	/**
	 * 查询新品上市的商品
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectNewGoodsByStatus() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<Goods> resultList = goodsService.selectGoodsByStatus("新品");
		if(resultList == null){
			 resultList = new ArrayList<Goods>();
		}
		for (Goods goods : resultList) {
			String[] pictures = goods.getGoods_pictureUrl().split(";");
			goods.setPictureUrl(pictures[0]);
			
		}
		return resultList;
	}
	/**
	 * 查询热销的商品
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectHotGoodsByStatus() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<Goods> resultList = goodsService.selectGoodsByStatus("热销");
		if(resultList == null){
			 resultList = new ArrayList<Goods>();
		}
		for (Goods goods : resultList) {
			String[] pictures = goods.getGoods_pictureUrl().split(";");
			goods.setPictureUrl(pictures[0]);
			
		}
		return resultList;
	}
	
	/**
	 * 查询推荐的商品
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectRecommendGoodsByStatus() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<Goods> resultList = goodsService.selectGoodsByStatus("推荐");
		if(resultList == null){
			 resultList = new ArrayList<Goods>();
		}
		for (Goods goods : resultList) {
			String[] pictures = goods.getGoods_pictureUrl().split(";");
			goods.setPictureUrl(pictures[0]);
			
		}
		return resultList;
	}
	/**
	 * 访问首页数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("index")
	public ModelAndView index()throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<Goods> resultNewList = selectNewGoodsByStatus();
		List<Goods> resultHotList = selectNewGoodsByStatus();
		List<Goods> resultRecommendList = selectNewGoodsByStatus();
		List<Goods> goodsTypes = goodsService.selectGoodsType();
		
		modelAndView.addObject("goodsTypes", goodsTypes);
		modelAndView.addObject("resultNewList", resultNewList);
		modelAndView.addObject("resultHotList",resultHotList);
		modelAndView.addObject("resultRecommendList",resultRecommendList);
		modelAndView.setViewName("goods/index");
		return modelAndView;
		
	}
}
