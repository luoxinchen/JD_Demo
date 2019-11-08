package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 主类启动器
 * @author lz
 *
 *还有个分页功能，参考page项目
 *
 */

@SpringBootApplication
@MapperScan({"com.demo.HuoWu","com.demo.Users","com.demo.Denglu","com.demo.ShangPinXiangQing","com.demo.SetGouWuChe"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}	
