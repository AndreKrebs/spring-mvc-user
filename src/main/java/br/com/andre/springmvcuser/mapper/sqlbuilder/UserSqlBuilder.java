package br.com.andre.springmvcuser.mapper.sqlbuilder;

import org.apache.ibatis.jdbc.SQL;

public class UserSqlBuilder {

	public static String buildFindByDynamicFilter(final String username, final String name, final String email) {
		return new SQL() {
			{
				SELECT("*");
				FROM("user");
				if (name != null) {
					OR().WHERE("name like #{name} || '%'");
				}
				if (username != null) {
					OR().WHERE("username like #{username}");
				}
				if (email != null) {
					OR().WHERE("email like #{email} || '%'");
				}
			}
		}.toString();
	}

}
