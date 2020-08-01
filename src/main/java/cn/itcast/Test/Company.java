package cn.itcast.Test;

/**
 * @ClassName Company
 * @Description TODO
 * @author: cdf
 * @Date: 2020-08-01 14:08
 **/
public class Company implements Wedding {

	private Wedding wedding;

	public Company(Wedding wedding) {
		this.wedding = wedding;
	}

	@Override
	public void happy() {
		before();
		this.wedding.happy();
		after();
	}

	public void before(){
		System.out.println("结婚前");
	}

	public void after(){
		System.out.println("结婚后");
	}
}
