package com.times.acs.pojo.admin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/** @author Hibernate CodeGenerator */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer"})
public class UserRolePOJO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    @Id
	@GeneratedValue
	private Long id;

    @ManyToOne
	private UserInfoPOJO user;

    @ManyToOne
	private RolesPOJO role;

    /** default constructor */
    public UserRolePOJO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RolesPOJO getRole() {
        return role;
    }

    public void setRole(RolesPOJO role) {
        this.role = role;
    }
    @JsonIgnore
    public UserInfoPOJO getUser() {
        return user;
    }

    public void setUser(UserInfoPOJO user) {
        this.user = user;
    }
}
