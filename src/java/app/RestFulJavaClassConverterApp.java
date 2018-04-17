/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import org.netbeans.saas.root.Rootwe;
import org.netbeans.saas.RestResponse;

/**
 *
 * @author Andrew
 */
public class RestFulJavaClassConverterApp {

    public static void main(String[] args) {

        try {
            java.lang.Integer decimal = 5;

            RestResponse result = Rootwe.converterDecToBin(decimal);
            //TODO - Uncomment the print Statement below to print result.
            System.out.println("The SaasService returned: "+result.getDataAsString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            int n = 5;
            org.fact.Factorial_Service service = new org.fact.Factorial_Service();
            org.fact.Factorial port = service.getFactorialPort();
            // TODO process result here
            int result1 = port.calculateFactorial(n);
            System.out.println("Result = " + result1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
