package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.pojo.GouWuChe;
import com.demo.pojo.HuoWu;
import com.demo.pojo.ShangHu;
import com.demo.pojo.Users;
import com.demo.Denglu.DLserviceImpl;
import com.demo.HuoWu.HuoWuServiceImpl;
import com.demo.SetGouWuChe.GouWuCheServiceImpl;
import com.demo.ShangPinXiangQing.XiangQingServiceImpl;
/**
 * 此类主要负责：
 * 		主页的跳转；
 * 		登录页面的跳转；
 * 		注册页面的跳转；
 * 		登录功能的实现；
 * 		注册功能的实现；
 * 		搜索框功能的实现；
 * 
 * @author Administrator
 *
 */
@Controller
@SessionAttributes(value = {"yonghuname","shanghuname"})
public class indexController {
	
//	主页搜索栏的功能
//	——————————————————————————————————————————————————————————————————————
	@Autowired
	private HuoWuServiceImpl serviceimpl;
//	——————————————————————————————————————————————————————————————————————
	
	
//	登录模块的功能
//	——————————————————————————————————————————————————————————————————————
	@Autowired
	private DLserviceImpl DlserviceImpl;
//	——————————————————————————————————————————————————————————————————————

	
//	物品详情模块的功能1
//	——————————————————————————————————————————————————————————————————————
	@Autowired
	private XiangQingServiceImpl xiangqingserviceimpl;
//	——————————————————————————————————————————————————————————————————————
	
	
	
//	物品详情模块的功能2
//	——————————————————————————————————————————————————————————————————————
	@Autowired
	private GouWuCheServiceImpl gouwucheserviceimpl;
//	——————————————————————————————————————————————————————————————————————
	

	
	
	
//  跳转到主页	
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
//	——————————————————————————————————————————————————————————————————————

	
	
//	跳转到用户登录页面
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/yonghudenglu")
	public String denglu(){
		return "denglu&zhuce/denglu";
	}
//	——————————————————————————————————————————————————————————————————————

	
//	跳转到用户个人页面
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/yonghugeren")
	public String yonghugeren(String string,Model model){
		model.addAttribute("yonghu",string);
		return "denglu&zhuce/gerenxinxi";
	}
//	——————————————————————————————————————————————————————————————————————
	
	
//	跳转到用户注册页面
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/yonghuzhuce")
	public String zhuce(){
		return "denglu&zhuce/zhuce";
	}
//	——————————————————————————————————————————————————————————————————————

	
//	跳转到商户登录页面
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/shanghudenglu")
	public String shangjiadenglu(){
		return "denglu&zhuce/shanghudenglu";
	}
//	——————————————————————————————————————————————————————————————————————

	
//	跳转到商户注册页面
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/shanghuzhuce")
	public String shangjiazhuce(){
		return "denglu&zhuce/shanghuzhuce";
	}
//	——————————————————————————————————————————————————————————————————————

	
	
//	用户登录功能代码
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/denglugongneng")
	public String denglugongneng(Users users1,Model model1){
		/*
		 * 此处是调用SQL查询用户名后，获得返回的值，获取password,
		 * 与前端表单的password对比后，用session进行记录；成功则跳转到主页面，并且主页面
		 * 的注册和登录按钮通过thymeleaf来对session进行判断；
		 * */
		List<Users> list = DlserviceImpl.showOne(users1);
		Users users3=null;
		for (Users users2 : list) {
			users3 = users2;
			}
			if(users3.getPassword().equals(users1.getPassword())){
				model1.addAttribute("yonghuname",users3.getName());
				return "redirect:index";
			}
			else
			return "redirect:ok";
	}
//	——————————————————————————————————————————————————————————————————————

//	用户注册功能代码	
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/zhucegongneng")
	public String zhucegongneng(Users users){
		/*
		 *前端输入信息进来后，直接调用语句进行insert操作；
		 *之后返回到登录界面，进行登录； 
		 */
		DlserviceImpl.addOne(users);
		return "redirect:denglu&zhuce/denglu";
	}
	
//	——————————————————————————————————————————————————————————————————————

	
//	商户登录功能代码
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/shanghudenglugongneng")
	public String shanghudenglu(ShangHu shanghu,Model model3){
		List<ShangHu> list = DlserviceImpl.showShangHu(shanghu);
		ShangHu shanghu3=null;

		for (ShangHu shanghu2 : list) {
			shanghu3=shanghu2;
		}
			if(shanghu3.getPassword().equals(shanghu.getPassword())){
				model3.addAttribute("shanghuname",shanghu3.getDianpuname());
				return "redirect:index";
			}
			else
			return "redirect:ok";
	}
	
//	商户注册功能代码	
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/shanghuzhucegongneng")
	public String shanghuzhuce(ShangHu shanghu){
		DlserviceImpl.addShanghu(shanghu);
		return "redirect:denglu&zhuce/shanghudenglu";
	}
	
//	——————————————————————————————————————————————————————————————————————
	
	
	
//	登录后显示用户姓名，点击可以跳转到个人页面
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/gerenxinxi")
	public String Yidenglu(){
		return "ok";
	}
//	——————————————————————————————————————————————————————————————————————

	
//	商户个人信息
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/shanghuxinxi")
	public String shanghuxinxi(){
		return "dianpu/shanghuxinxi";
	}
//	——————————————————————————————————————————————————————————————————————

	
	
//	我的店铺
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/wodedianpu")
	public String wodedianpu(){
		return "dianpu/dianpu";
	}
//	——————————————————————————————————————————————————————————————————————

	
	
	
//	购物车功能代码
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/gouwuche")
	public String gouwuche(Model model){
		List<GouWuChe> list = this.gouwucheserviceimpl.showAllGouWuChe();
		model.addAttribute("gouwuchexinxi",list);
		return "gouwuche";
	}
//	——————————————————————————————————————————————————————————————————————
	
	
	
//	跳转到搜索结果页面
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/sousuo")
	public String sousuo1(HuoWu huowu,Model model){

		//先初步判断搜索框中是否有内容
		if((huowu.getName()!=null)&&(huowu.getName()!="")){
			
			//调用搜索方法，把查到的所有信息放进list集合中；
			List<HuoWu> list = serviceimpl.showAll(huowu);
			
			//定义一个list集合，找出放在第一列中的数据；
			//	——————————————————————————————————————————————————				
			List<HuoWu> list1 = new ArrayList<HuoWu>();
			
			for(int i=1;i<=list.size();i++){
					if(i%3==1){
						list1.add(list.get(i-1));
					}
				}
			//	——————————————————————————————————————————————————			
			
			
			//定义一个list集合，找出放在第二列中的数据；
			//	——————————————————————————————————————————————————				
			List<HuoWu> list2 = new ArrayList<HuoWu>();
			
			for(int i=1;i<=list.size();i++){
					if(i%3==2){
						list2.add(list.get(i-1));
					}
				}
			//	——————————————————————————————————————————————————		
				
				
			//定义一个list集合，找出放在第二列中的数据；
			//	——————————————————————————————————————————————————				
			List<HuoWu> list3 = new ArrayList<HuoWu>();
				
			for(int i=1;i<=list.size();i++){
				if(i%3==0){
					list3.add(list.get(i-1));
				}
			}
			//	——————————————————————————————————————————————————			
			
			
			

			model.addAttribute("list1",list1);
			model.addAttribute("list2",list2);
			model.addAttribute("list3",list3);
			
			return "showAll";
			}
		else
			return "redirect:ok";
		}
//	——————————————————————————————————————————————————————————————————————
	
	
//	搜索结果页面商品跳转到商品详情页
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/shangpinxiangqing")
	public String shangpinxiangqing(String hidden,Model model){
		HuoWu huowu = this.xiangqingserviceimpl.showHuoWu(hidden);
		
		model.addAttribute("huowu",huowu);
		return "shangpinxiangqing";
	}
//	——————————————————————————————————————————————————————————————————————

	
//	商品详情页面把商品添加到购物车
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/setgouwuche")
	//	hidden2:货物名;  hidden3:用户名;    number：购买几个
	public String setgouwuche(String hidden2,String hidden3,int number,Model model){
		
		//此处留意，如果未登录，前端传过来的hidden3不是null;
		
		if(hidden3.equals("")){
			return "denglu&zhuce/denglu";
			}
		else {
			HuoWu huoWu = this.gouwucheserviceimpl.selectOneHuoWu(hidden2);
			int id = huoWu.getId();
			String name = huoWu.getName();
			int number1 = huoWu.getNumber();
			float price = huoWu.getPrice();
			this.gouwucheserviceimpl.addgouwuche(hidden3,number,id,name,number1,price);
			return "redirect:index";
		}
	}
//	——————————————————————————————————————————————————————————————————————
	
//	购物车发送数据到最后的结算界面;
//	注:和页面数据传输有关的，不要用重定向redirect;
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/jiesuan")
	public String jiesuan(HttpServletRequest request){
		String[] strings = request.getParameterValues("checkbox");
		for (String string : strings) {
			//已经购买了，购物车内相应的物品也应该消失	

			String string2 = string.substring(0, string.indexOf(","));
			this.gouwucheserviceimpl.deleteOneGouwuche(string2);
			
		}
		
		//可以在此处添加到订单表中，功能简化，就不写了；		
		return "goumai";
	}
//	——————————————————————————————————————————————————————————————————————


	
//	未开发功能控制器（帮助开发时测试的）
//	——————————————————————————————————————————————————————————————————————
	@RequestMapping("/weikaifagongneng")
	public String weikaifagongneng(){
		return "weikaifagongneng";
	}
//	——————————————————————————————————————————————————————————————————————
	
}