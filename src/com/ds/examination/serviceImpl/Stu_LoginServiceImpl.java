package com.ds.examination.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ds.examination.DAO.Stu_LoginDAO;
import com.ds.examination.service.Stu_LoginService;

@Component("stu_LoginService")
public class Stu_LoginServiceImpl implements Stu_LoginService {

	private Stu_LoginDAO stu_LoginDAO;
	public Stu_LoginDAO getStu_LoginDAO() {
		return stu_LoginDAO;
	}
	@Resource
	public void setStu_LoginDAO(Stu_LoginDAO stu_LoginDAO) {
		this.stu_LoginDAO = stu_LoginDAO;
	}
	
	//是否已经报名
	public boolean isEmty(String username) throws Exception {
		
		return stu_LoginDAO.isEmty(username);
	}

}
