package ru.bellIntegrator.mockRestApi.data;

public class Account {
    private String email;
    private String password;
    public Integer id;


    public Account(){

    }

    public Account(String email, String password, Integer id) {
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public Integer getId() {
		return id;
	}
    
    
}
