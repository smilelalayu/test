package com.times.acs.pojo.admin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.miitgxt.common.model.BaseModel;


/** @author Hibernate CodeGenerator */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer"})
public class UsergroupRolePOJO extends BaseModel<UsergroupRolePOJO,Long> implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** identifier field */
    @Id
	@GeneratedValue
	private Long id;

    /** nullable persistent field */
    @ManyToOne
	private UserGroupPOJO userGroup;

    @ManyToOne
	private RolesPOJO role;



    /** default constructor */
    public UsergroupRolePOJO() {
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

    public UserGroupPOJO getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroupPOJO userGroup) {
        this.userGroup = userGroup;
    }

	@Version
	protected Integer version;



	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


}
