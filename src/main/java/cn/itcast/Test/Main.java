package cn.itcast.Test;

/**
 * @ClassName Main
 * @Description TODO
 * @author: cdf
 * @Date: 2020-08-01 14:10
 **/
public class Main {
	public static void main(String[] args) {

		You you = new You();

		Company company = new Company(you);

		company.before();
	}
}
