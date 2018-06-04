/*Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite.
Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), despositar dinheiro, consultar saldo e verificar se o cliente
está usando cheque especial ou não. Desenvolva um programa para testar essa classe.*/

package br.com.aula25a27.exercicios;

public class ContaCorrente {  

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;

    
    boolean realizarSaque(double quantiaASacar){

        //tem saldo na conta

        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;

        } else { //não tem saldo na conta

            if (especial) {

                //verificar se o limite especial tem saldo

                double limite = limiteEspecial + saldo;

                if (limite >= quantiaASacar){

                    saldo -= quantiaASacar;

                    return true;

                } else {

                    return false;
                }

            } else {

                return false; //não é especial e não tem saldo suficiente
            }

        }    

    }   
    
    void depositar(double valorDepositado){      

        saldo += valorDepositado;
    }

    void consultarSaldo(){

        System.out.println("Saldo atual da conta = " + saldo); 

    }

    boolean verificarUsoChequeEspecial(){

        return saldo < 0;
    }
}