/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskD;

/**
 *
 * @author Chew
 */
public class deliveryManCollection {
    private deliveryMan[] info;
    
    public deliveryManCollection(){
        info = collectInfo();
    }
    
    public deliveryMan[] collectInfo(){
        deliveryMan[] info ={new deliveryMan("Peter Tan","911121-08-6541","Male","016-3345789","XXX","A1234"),
            new deliveryMan("Kelvin Hew","881129-08-5516","Male","019-4457238","YYY","B1234"),
            new deliveryMan("Jimmy Lee","830614-13-4789","Male","012-5456218","ZZZ","C1234"),
            new deliveryMan("Derak Chong","891125-10-9993","Male","017-3354821","AAA","D1234"),
            new deliveryMan("Jessica Ng","930324-10-4521","Female","010-3994745","BBB","E1234")};
        return info;
    }
    
    public String[] getdeliveryManId() {
        String[] ID = new String[info.length];
        for (int i = 0; i < info.length; ++i) {
            ID[i] = info[i].getid();
        }
        return ID;
    }

    /*public deliveryMan get(int index) {
        return info[index];
    }*/
}
