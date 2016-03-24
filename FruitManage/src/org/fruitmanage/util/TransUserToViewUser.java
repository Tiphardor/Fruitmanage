package org.fruitmanage.util;

import org.fruitmanage.entity.User;
import org.fruitmanage.vo.ViewUser;

public class TransUserToViewUser {
	public static ViewUser transUToV(User user){
		ViewUser viewUser = new ViewUser();
		viewUser.setId(user.getId());
		viewUser.setUserName(user.getUserName());
		viewUser.setRealName(user.getRealName());
		viewUser.setPhone(user.getPhone());
		viewUser.setAddress(user.getAddress());
		viewUser.setPostcode(user.getPostcode());
		return viewUser;
	}
}
