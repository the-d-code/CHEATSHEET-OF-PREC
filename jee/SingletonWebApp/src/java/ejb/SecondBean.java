/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author root
 */
@Singleton
public class SecondBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

@PostConstruct
public void initialize()
{
  System.out.println("SecondBean  is initialized in ");  
}
}
