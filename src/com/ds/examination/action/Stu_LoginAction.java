package com.ds.examination.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.apache.struts2.convention.annotation.Result;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.examination.service.Stu_LoginService;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Namespace("/")
@Action(value="login",results={@Result(name="success",
type="redirect",location="/main.jsp"),@Result(name="error",location="/index.jsp")})
public class Stu_LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Stu_LoginService stu_LoginService;
	private String username;
		
	
	 public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Stu_LoginAction() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		stu_LoginService = (Stu_LoginService)ctx.getBean("stu_LoginService");
	}
	
	
	public Stu_LoginService getStu_LoginService() {
		return stu_LoginService;
	}


	public void setStu_LoginService(Stu_LoginService stu_LoginService) {
		this.stu_LoginService = stu_LoginService;
	}


	@Override
	public String execute() throws Exception {
		
		System.out.println(stu_LoginService.isEmty(username));
		
		return SUCCESS;
	}
}
