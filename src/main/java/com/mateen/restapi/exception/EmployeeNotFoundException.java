package com.mateen.restapi.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id){

        super("Employee with this " + id + " not found" );

    }
}
