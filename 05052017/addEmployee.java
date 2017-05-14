/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author hnd
 */
public class addEmployee {
    private int emplyeeNumber;
    private String employeeName;
    private double employeebS;
    private double employeeOTR;
    private double employeeOTH;
    
    public void setEmpNo(int eno)
    {
        emplyeeNumber = eno;
    }
    public void setEmpName(String ename)
    {
        employeeName = ename;
    }
    public void setEmpBS(double ebs)
    {
        employeebS = ebs;
    }
    public void setEmpOTR(double eotr)
    {
        employeeOTR = eotr;
    }
    public void setEmpOTH(double eoth)
    {
        employeeOTH = eoth;
    }
    
    public int getEmpNo()
    {
        return emplyeeNumber;
    }
    
    
}
