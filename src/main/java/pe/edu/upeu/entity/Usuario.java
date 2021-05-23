package pe.edu.upeu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusuario;
	private String username;
	private String email;
	private int phone;
	public Usuario() {}
	
	public Usuario(Long idusuario, String username, String email, int phone) {
		super();
		this.idusuario = idusuario;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}

	public Long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", username=" + username + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
}
