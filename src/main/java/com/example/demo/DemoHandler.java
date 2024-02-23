package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHandler {
	
    // Handling post request
	ArrayList<Employee> Data=new ArrayList<Employee>();
	
	// data ghya sathi
    @PostMapping("/EnterDetails") 
    String insert(@RequestBody Employee ob) 
    { 
        // Storing the incoming data in the list 
        Data.add(new Employee(ob.id, ob.salary, ob.name,ob.address,ob.gender)); 
  
        // Iterating using foreach loop 
        for (Employee obd : Data) { 
            System.out.println(obd.id + " " + obd.salary +" "+obd.name +" "+obd.address +" "+obd.gender); 
        } 
        return "Data Inserted"; 
    } 
    
    //user se data lene k liye
    
    @GetMapping("/list")
    public List<Employee> getALLList(){
    	return Data;
    }
    
    //for deleting the data
    
    @DeleteMapping("/delete/{id}")
    public void deleteEmpById(@PathVariable Employee ob) {
    	Data.contains(Data.get(0));
    }
	
    @DeleteMapping("/Delete")
    public void deleteAllEmp() {
    	Data.clear();
    }
}
