/*Cria uma classe para representar uma conta corrente que possui um n�mero, um saldo, um status que informa se ela � especial ou n�o, um limite.
Desenvolva m�todos para realizar saque (verificando se o cliente pode realizar saques), despositar dinheiro, consultar saldo e verificar se o cliente
est� usando cheque especial ou n�o. Desenvolva um programa para testar essa classe.*/

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

        } else { //n�o tem saldo na conta

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

                return false; //n�o � especial e n�o tem saldo suficiente
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