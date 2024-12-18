package Main;

import Controller.EmployeeController;
import DAO.EmployeeDAOImpl;
import Model.EmployeeModel;
import View.EmployeeView;

public class Main {

    public static void main(String[] args) {
        EmployeeController employeeController =
                new EmployeeController(new EmployeeModel(new EmployeeDAOImpl()),
                        EmployeeView.getInstance());

        EmployeeView.getInstance();
    }
}