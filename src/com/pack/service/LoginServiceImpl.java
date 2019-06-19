package com.pack.service;

import com.pack.dao.LoginDaoImpl;
import com.pack.model.Admin;

public class LoginServiceImpl implements LoginService {

	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkLogin(Admin a) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().checkLogin(a);
	}

	@Override
	public int getCount(Admin a) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getCount(a);
	}

	@Override
	public int incrementCount(Admin a,int i) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().incrementCount(a,i);
	}

	@Override
	public int setZeroCount(Admin a) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().setZeroCount(a);
	}
	
	public String getUsername(Admin a)
	{
		return new LoginDaoImpl().getUsername(a);
	}

	@Override
	public String getDesignation(Admin a) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getDesignation(a);
	}

	@Override
	public String getOffice(Admin a) {
		// TODO Auto-generated method stub
		return new LoginDaoImpl().getOffice(a);
	}

}
