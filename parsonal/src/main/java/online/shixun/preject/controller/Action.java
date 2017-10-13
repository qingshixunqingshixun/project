package online.shixun.preject.controller;

import java.util.Map;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import online.shixun.preject.Service.AdminService;
import online.shixun.preject.Service.BankService;
import online.shixun.preject.Service.FinancingService;
import online.shixun.preject.model.Admin;
import online.shixun.preject.model.Bank;
import online.shixun.preject.model.Financing;



public class Action implements ModelDriven<Admin> {
	private Admin admin=new Admin();
	private Map<String , Object> map=ActionContext.getContext().getSession();
	private Bank bank=new Bank();
	private Financing financing=new Financing();
	@Resource
	private AdminService adminService;
	@Resource
	private BankService bankService;
	@Resource
	private FinancingService financingService;
	
	
	public void setBankService(BankService bankService) {
		this.bankService = bankService;
	}

	public void setFinancingService(FinancingService financingService) {
		this.financingService = financingService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Financing getFinancing() {
		return financing;
	}

	public void setFinancing(Financing financing) {
		this.financing = financing;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}
	

}
