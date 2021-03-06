package controller.implementations;
// Generated 10-Mar-2019 19:07:27 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UsersHaveUsers generated by hbm2java
 */
@Entity
@Table(name="users_have_users"
    ,catalog="chat"
)
public class UsersHaveUsers  implements java.io.Serializable {


     private UsersHaveUsersId id;
     private Users usersByPhoneB;
     private Users usersByPhoneA;
     private String acceptanceStatus;

    public UsersHaveUsers() {
    }

    public UsersHaveUsers(UsersHaveUsersId id, Users usersByPhoneB, Users usersByPhoneA, String acceptanceStatus) {
       this.id = id;
       this.usersByPhoneB = usersByPhoneB;
       this.usersByPhoneA = usersByPhoneA;
       this.acceptanceStatus = acceptanceStatus;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="phoneA", column=@Column(name="phone_a", nullable=false, length=20) ), 
        @AttributeOverride(name="phoneB", column=@Column(name="phone_b", nullable=false, length=20) ) } )
    public UsersHaveUsersId getId() {
        return this.id;
    }
    
    public void setId(UsersHaveUsersId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="phone_b", nullable=false, insertable=false, updatable=false)
    public Users getUsersByPhoneB() {
        return this.usersByPhoneB;
    }
    
    public void setUsersByPhoneB(Users usersByPhoneB) {
        this.usersByPhoneB = usersByPhoneB;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="phone_a", nullable=false, insertable=false, updatable=false)
    public Users getUsersByPhoneA() {
        return this.usersByPhoneA;
    }
    
    public void setUsersByPhoneA(Users usersByPhoneA) {
        this.usersByPhoneA = usersByPhoneA;
    }

    
    @Column(name="acceptance_status", nullable=false, length=40)
    public String getAcceptanceStatus() {
        return this.acceptanceStatus;
    }
    
    public void setAcceptanceStatus(String acceptanceStatus) {
        this.acceptanceStatus = acceptanceStatus;
    }




}


