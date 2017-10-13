package online.shixun.preject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 银行卡类
 * */
@Entity
@Table(name="bank",catalog="personalfinance")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false,unique=true)
	private int id;
	
	//卡号
	@Column(name="cardnumber")
	private String cardNumber;
	
	//开户行
	@Column(name="openbank")
	private String openBank;
	
	//银行名称
	@Column(name="bankname")
	private String bankName;
	
	//余额
	@Column(name="balance")
	private double balance;
	
	//银行卡与用户多对一
	@ManyToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="admin")
	public Admin admin ;
	
	//银行卡与理财一对多
	@OneToMany(mappedBy="financing",fetch=FetchType.EAGER)
	public Set<Financing> financing=new HashSet<>();
}
