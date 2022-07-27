package yacine.hotel.dao;

import yacine.hotel.entity.Role;

//DAO Pattern for Role
public interface RoleDao {

	public Role findRoleByName(String roleName);
	
}
