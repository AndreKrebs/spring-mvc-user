package br.com.andre.springmvcuser.mapper.sqlbuilder;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlBuilder {

	public static String buildFindByDynamicFilter(final @Param("username") String username, final @Param("name") String name, final @Param("email") String email) {
		return new SQL() {
			{
				SELECT("*");
				FROM("user");
				if (name != null && !name.isEmpty()) {
					OR().WHERE("name like '%' #{name} '%' ");
				}
				if (username != null && !username.isEmpty()) {
					OR().WHERE("username like '%' #{username} '%'");
				}
				if (email != null && !email.isEmpty()) {
					OR().WHERE("email like '%' #{email} '%'");
				}
			}
		}.toString();
	}

}
