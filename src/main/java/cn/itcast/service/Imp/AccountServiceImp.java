package cn.itcast.service.Imp;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: cdf
 * @create: 2019-12-08 23:25
 **/

@Service("accountService")
public class AccountServiceImp implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public List<Account> findAll() {
		System.out.println("业务层：查询账户");
		return accountDao.findAll();
	}

	@Override
	public void saveAccount(Account account) {
		System.out.println("业务层：保存账户");
		accountDao.saveAccount(account);

	}
}
