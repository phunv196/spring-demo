package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "hospitals")
@Data
public class HospitalHbnBO {
	@Id
	  @Column(name = "hospital_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long hospitalId;
	
	@Column(name = "hospital_name")
	private String hospitalName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "fex")
	private String fex;
}
