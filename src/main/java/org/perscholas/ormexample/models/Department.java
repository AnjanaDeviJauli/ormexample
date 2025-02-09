package org.perscholas.ormexample.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Department {
	
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int depId;
    @NonNull
    String deptName;
	
	
	
}
