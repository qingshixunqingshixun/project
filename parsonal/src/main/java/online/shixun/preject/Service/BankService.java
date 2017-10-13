package online.shixun.preject.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import online.shixun.preject.Dao.BankDao;



@Service
public class BankService {
	private BankDao bankDao;
	
	@Resource
	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}
	
}
