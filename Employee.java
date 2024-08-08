public class Employee {
    private int empId;
    private String empName;
    private Long empSal;

    // Constructor using fields
    public Employee(int empId, String empName, Long empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    // Default constructor
    public Employee() {
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Long empSal) {
        this.empSal = empSal;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
