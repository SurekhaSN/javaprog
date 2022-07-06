
public class CalulateSalary{




public void calculateTotalSalary(int empId, int empBasic, int empHra, int empPF){
	 employeeId=empId; 
	 employeeBasic=empBasic ; 
	 employeeHra=empHra ;
	 employeePF=empPF;
   
Empolyee rinkuSalary=new Empolyee();
rinkuSalary.CalulateTotalSalary(105,8000,400,100);

System.out.println("Employee Id = "+employeeId);
		totalSalary=employeeBasic+employeeHra+employeePF;

}

}


