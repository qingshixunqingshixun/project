package online.shixun.preject.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import online.shixun.preject.Dao.FinancingDao;
import online.shixun.preject.model.Financing;



@Service
public class FinancingService {
	private Financing financingDao;

	@Resource
	public void setFinancingDao(Financing financingDao) {
		this.financingDao = financingDao;
	}
	
	
	
	
	
}
