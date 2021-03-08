package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "potision")
@Data
public class PotisionHbnBO {
	@Id
	@Column(name = "potision_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long potisionId;
	
	@Column(name = "potision_code")
	  private String potisionCode;
	
	@Column(name = "potision_name")
	  private String potisionName;
}
