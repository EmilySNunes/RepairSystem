
package Controle;

import Modelo.ContratoDao;
import Visao.TelaContrato;

public class RegraMostraContrato {
    
     private final TelaContrato TC;
     private ContratoDao CD;

    
        
    

    public RegraMostraContrato(TelaContrato TC1) {
        
        this.TC = TC1;
        this.CD = new ContratoDao();
        
    }

   
    
    
}
