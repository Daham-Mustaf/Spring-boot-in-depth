package com.daham.entyty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Depertment_tb")
public class Depertment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long depertmentId;
	private String depertmentName;
	private String depertmentAddress;
	private String depertmentCod;

}
