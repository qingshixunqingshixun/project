package online.shixun.preject.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 理财类
 * */
@Entity
@Table(name="financing",catalog="personalfinance")
public class Financing {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false,unique=true)
	private int id;
	
	//收入
	@Column(name="income")
	private double income;
	
	//支出
	@Column(name="expenditure")
	private double expenditure;
	
	//创建时间
	@Temporal(TemporalType.DATE)
	@Column(name="createdate")
	private Date createDate;
	
	//理财表与用户多对一
	@ManyToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="admin")
	private Admin admin;
	
	//理财与银行卡多对一
	@ManyToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="bank")
	private Bank bank;
}
