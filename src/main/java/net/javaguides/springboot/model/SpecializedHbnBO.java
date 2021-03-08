package net.javaguides.springboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "specialized")
@Data
public class SpecializedHbnBO {
	@Id
	@Column(name = "specialized_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long specializedId;
	
	@Column(name = "specialized_time")
	  private String specializedTime;
	
	@Column(name = "specialized_name")
	  private String specializedName;
}
