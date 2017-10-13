package online.shixun.preject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 用户类
 * */
@Entity
@Table(name="admin",catalog="personalfinance")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false,unique=true)
	private int id;
	
	//账户
	@Column(name="uname")
	private String uname;
	
	//密码
	@Column(name="upwd")
	private String upwd;
	
	//状态
	@Column(name="stat")
	private int stat;
	
	//用户与理财一对多
	@OneToMany(mappedBy="financing",fetch=FetchType.EAGER)
	private Set<Financing>financing=new HashSet<>();
	
	//用户与银行卡一对多
	@OneToMany(mappedBy="bank",fetch=FetchType.EAGER)
	private Set<Bank> bank=new HashSet<>();
}
