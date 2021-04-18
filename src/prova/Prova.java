/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author Edson Nathan
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    double distance, consumption, pay, value, consumptionL, consumptionR;
        boolean paradas;
        int motorcycle;
        String local;

        //scanner
        Scanner entrada = new Scanner(System.in);

        //Sistema
        System.out.println("Qual sera a diastancia percorrida em Km? ");
        distance = entrada.nextDouble();

        System.out.println("Qual o preço do combustivel? ");
        value = entrada.nextDouble();




        System.out.println("Qual o local que você ira? ");
        local = entrada.nextLine();
        
        System.out.println("O caminho tem muitas paradas obrigatorias? ");
        System.out.println("[true] Sim");
        System.out.println("[false] Nao");
        System.out.println(">>>digite aqui sua opção<<<");
        burraco = entrada.nextBoolean();

        
        System.out.println("Qual moto voce ira utilizar? ");
        System.out.println("[1] Honda Biz 125 ");
        System.out.println("[2] Honda CB300 ");
        System.out.println("[3] Suxiki DR 300 ");
        System.out.println(">>>digite aqui sua opção<<<");
        car = entrada.nextInt();

        switch (motorcycle) {
            
            //Honda Biz 125
            case 1: 
                if (paradas = false){
                    consumption = 40;
                }
                else {
                    consumption = 40 - 2;
                }
                
                consumptionL = distance / consumption;
                pay = consumptionL * value;

                
                System.out.println ("Para chegar a " + local + " você irá gastar " + pay + " reais!");
                System.out.println ("Voce ira consumir " + consumptionL + "Litros de gasolona!");
                break;

            //Honda CB300
            case 2: 
                if (paradas = false){
                    consumption = 24;
                }
                else {
                    consumption = 24 - 2;
                }


                consumptionL = distance / consumption;
                pay = consumptionL * value;

                System.out.println ("Para chegar a " + local + " você irá gastar " + pay + " reais!");
                System.out.println ("Voce ira consumir " + consumptionL + "Litros de gasolona!");
                break;

            //Suxiki DR 300
            case 3: 
                if (paradas = false){
                    consumption = 32;
                }
                else {
                    consumption = 32 - 2;
                }


                consumptionL = distance / consumption;
                pay = consumptionL * value;

                System.out.println ("Para chegar a " + local + " você irá gastar " + pay + " reais!");
                System.out.println ("Voce ira consumir " + consumptionL + "Litros de gasolona!");
                break;
        }

        
    }
}
