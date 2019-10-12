/**
 * 
 */
package com.hackthon.solatech.model;

import java.util.List;

/**
 * @author User1
 *
 */
public class UserResponseBO extends SolaTechResponseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<UserBo> userBos;

	/**
	 * @return the userBos
	 */
	public List<UserBo> getUserBos() {
		return userBos;
	}

	/**
	 * @param userBos the userBos to set
	 */
	public void setUserBos(List<UserBo> userBos) {
		this.userBos = userBos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((userBos == null) ? 0 : userBos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserResponseBO other = (UserResponseBO) obj;
		if (userBos == null) {
			if (other.userBos != null)
				return false;
		} else if (!userBos.equals(other.userBos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserResponseBO [userBos=");
		builder.append(userBos);
		builder.append("]");
		return builder.toString();
	}

}
