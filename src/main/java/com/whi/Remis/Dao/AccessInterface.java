package com.whi.Remis.Dao;

import com.whi.Remis.Model.Company;
import com.whi.Remis.Model.User;
import java.util.List;

public interface AccessInterface {
	public List<Company> getCompany();
	public List<User> user();			
}
