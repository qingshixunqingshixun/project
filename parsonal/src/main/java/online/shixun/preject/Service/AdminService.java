package online.shixun.preject.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import online.shixun.preject.Dao.AdminDao;


@Service
public class AdminService {
	private AdminDao adminDao;
	
	@Resource
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
}
