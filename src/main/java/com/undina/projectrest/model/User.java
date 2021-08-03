package com.undina.projectrest.model;



import javax.persistence.Entity;
import java.util.Set;

public class User extends AbstractNamedEntity{
    protected String email;
    protected String password;
    private Set<Role> roles;
    private boolean enabled = true;

    public User(Integer id, String name, String email, String password, Set<Role> roles, boolean enabled) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.enabled = enabled;
    }

    public User() {
    }
}
