package siva.bootcore.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class EmployeeRunner implements CommandLineRunner {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private List<String> companyProjects;
	private Set<String> usingTools;
	private String[] usingSoftwatres;
	private Properties projectDetails;
	private Map<Integer, String> employeeDetails;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public List<String> getCompanyProjects() {
		return companyProjects;
	}

	public void setCompanyProjects(List<String> companyProjects) {
		this.companyProjects = companyProjects;
	}

	public Set<String> getUsingTools() {
		return usingTools;
	}

	public void setUsingTools(Set<String> usingTools) {
		this.usingTools = usingTools;
	}

	public String[] getUsingSoftwatres() {
		return usingSoftwatres;
	}

	public void setUsingSoftwatres(String[] usingSoftwatres) {
		this.usingSoftwatres = usingSoftwatres;
	}

	public Properties getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(Properties projectDetails) {
		this.projectDetails = projectDetails;
	}

	public Map<Integer, String> getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(Map<Integer, String> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "EmployeeRunner [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", companyProjects=" + companyProjects + ", usingTools=" + usingTools
				+ ", usingSoftwatres=" + Arrays.toString(usingSoftwatres) + ", projectDetails=" + projectDetails
				+ ", employeeDetails=" + employeeDetails + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Print Employee ALL Details");
		System.out.println(this);

	}

}
