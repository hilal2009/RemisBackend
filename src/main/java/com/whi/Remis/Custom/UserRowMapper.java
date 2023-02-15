package com.whi.Remis.Custom;
import com.whi.Remis.Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        
        user.setUserId(rs.getString("User_Id"));
        user.setRegDate(rs.getString("Reg_Date"));
        user.setUserName(rs.getString("User_Name"));
        user.setGender(rs.getString("Gender"));
        user.setSecName(rs.getString("Sect_Name"));
        
        return user;
    }
    
}
