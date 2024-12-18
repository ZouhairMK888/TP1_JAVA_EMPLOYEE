package DAO;

import java.util.List;
import Model.Employee;

public interface EmployeeDAOI {
    public List<Employee> afficher();
    public void ajouter(Employee t);
    public void modifier(Employee t,int id);
    public void supprimer(int id);
    public Employee findById(int EmployeeId);
}