/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mbds.mg.tplukas46.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mbds.mg.tplukas46.ejb.CustomerManager;
import mbds.mg.tplukas46.entities.Customer;

/**
 *
 * @author lukas
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {  
  private List<Customer> customerList;  

  @EJB
  private CustomerManager customerManager;  
        
  public CustomerBean() {  }  
        
  /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = this.customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
