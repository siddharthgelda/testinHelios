package spittr.web;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import spittr.person;

@Service
public class PersonRepositoryImpl implements PersonRepository {
	@Autowired
    protected JdbcTemplate jdbc;
	
	public int addPerson(person p){
		
	    String sql = "INSERT INTO person(usewrname, password, firstName, lastName) VALUES(?,?,?,?)";
	    return jdbc.update(sql, p.getUsewrname(),
	        p.getPassword(), p.getFirstName(), p.getLastName());
	    
	  }
	
	public person getUser(long id) {
        return jdbc.queryForObject("SELECT * FROM person WHERE id=?", personMapper, id);
    }
	private static final RowMapper<person> personMapper = new RowMapper<person>() {
        public person mapRow(ResultSet rs, int rowNum) throws SQLException {
        	person user = new person(rs.getLong("id"), rs.getString("usewrname"),rs.getString("password"),rs.getString("firstName"),rs.getString("lastName"));
            return user;
        }
    };
}
