
package com.whi.Remis.Custom;
import com.whi.Remis.Model.Company;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CompanyRowMapper implements RowMapper{

	@Override
	public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		Company company = new Company();		
		
		company.setCompanyId(rs.getInt("Comp_Id"));
		company.setCompanyName(rs.getString("Comp_Name"));
		company.setPhoneNumber(rs.getString("Comp_Phone"));
		company.setPostalAddress(rs.getString("Postal_Address"));
		company.setPhysicalAddress(rs.getString("Physical_Address"));
		company.setEmailAddress(rs.getString("Email_Address"));	
		
		return company;
	}	
}
