package siva.bootcore.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
//@AllArgsConstructor
public class Employee {
	@NonNull
	private int employeeId;
	@NonNull
	private String employeeName;
	@NonNull
	private double employeeSalary;
}
