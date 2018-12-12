package br.com.andre.springmvcuser.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import br.com.andre.springmvcuser.domain.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM user")
	public List<User> findAll();
	
	@Insert("INSERT INTO user(username,password,is_enabled,register_date,name,surname,email,phone)VALUES(#{username},#{password},#{is_enabled},#{register_date},#{name},#{surname},#{email},#{phone})")
	public void insert(User user);
	
	@Select("<script> "
			+ "SELECT * FROM user "
			+ "<where>"
			+ "<if test=\"username != null\"> OR username LIKE #{username} </if>"
			+ "<if test=\"name != null\"> OR name LIKE #{name} </if>"
			+ "<if test=\"email != null\"> OR email LIKE #{email} </if>"
			+ "</where>"
			+ " </script>")
//	@SelectProvider(type = UserSqlBuilder.class, method = "buildFindByDynamicFilter")
	public List<User> findByDynamicFilter(@Param("username") String username, 
			@Param("name") String name, @Param("email") String email);
	
	
	
}
