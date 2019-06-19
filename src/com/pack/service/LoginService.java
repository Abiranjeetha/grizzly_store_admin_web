package com.pack.service;

import com.pack.model.Admin;

public interface LoginService {
	public boolean checkLogin(Admin a);
	public int getCount(Admin a);
	public int incrementCount(Admin a,int i);
	public int setZeroCount(Admin a);
	public String getUsername(Admin a);
	public String getDesignation(Admin a);
	public String getOffice(Admin a);
}
