package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "education")
@Data
public class EducationHbnBO {
	@Id
	@Column(name = "education_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long educationId;
	
	@Column(name = "education_name")
	  private String educationName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "fex")
	private String fex;
}
