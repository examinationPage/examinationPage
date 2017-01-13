package com.ds.examination.action;
import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;

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

	
	public Stu_LoginService getStu_LoginService() {
		return stu_LoginService;
	}

	@Resource
	public void setStu_LoginService(Stu_LoginService stu_LoginService) {
		this.stu_LoginService = stu_LoginService;
	}


	public String execute() throws Exception {
		
		System.out.println(stu_LoginService.isEmty(username));
		
		return SUCCESS;
	}
}
