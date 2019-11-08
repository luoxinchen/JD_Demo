package com.demo.pojo;
/**
 * 
 * 此类为商户类
 * 		包含商户数据表中的所有列名；
 * @author Administrator
 *
 */
public class ShangHu {
	private int id;
//	店铺名
	private String dianpuname;
//	店主名
	private String dianzhuname;
//	营业执照号码
	private int yingyezhizhaonumber;
//	食品经营许可证号码
	private int shipinjingyingxukezhengnumber;
//	密码
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDianpuname() {
		return dianpuname;
	}
	public void setDianpuname(String dianpuname) {
		this.dianpuname = dianpuname;
	}
	public String getDianzhuname() {
		return dianzhuname;
	}
	public void setDianzhuname(String dianzhuname) {
		this.dianzhuname = dianzhuname;
	}
	public int getYingyezhizhaonumber() {
		return yingyezhizhaonumber;
	}
	public void setYingyezhizhaonumber(int yingyezhizhaonumber) {
		this.yingyezhizhaonumber = yingyezhizhaonumber;
	}
	public int getShipinjingyingxukezhengnumber() {
		return shipinjingyingxukezhengnumber;
	}
	public void setShipinjingyingxukezhengnumber(int shipinjingyingxukezhengnumber) {
		this.shipinjingyingxukezhengnumber = shipinjingyingxukezhengnumber;
	}
	@Override
	public String toString() {
		return "ShangHu [id=" + id + ", dianpuname=" + dianpuname + ", dianzhuname=" + dianzhuname
				+ ", yingyezhizhaonumber=" + yingyezhizhaonumber + ", shipinjingyingxukezhengnumber="
				+ shipinjingyingxukezhengnumber + ", password=" + password + "]";
	}
}
