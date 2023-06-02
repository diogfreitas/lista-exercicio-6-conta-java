import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
    System.out.println("Conta Bancaria");
    Scanner scanner = new Scanner(System.in);
    
    ContaBancaria contagBancaria = new ContaBancaria();
    System.out.print("coloque seu saldo inicial :");
    double numeroUm = scanner.nextDouble();
   
    System.out.print("Coloque o seu nome :");
    String nomeDaPessoa = scanner.next();

    System.out.print("Coloque o Numero da conta :");
    int numeroConta = scanner.nextInt();
        contagBancaria.setSaldoInicial(numeroUm);
        contagBancaria.setNomeDaConta(nomeDaPessoa);
        contagBancaria.setNumeroDaConta(numeroConta);

    System.out.println("CONTA CRIADA COM SUCESSO!!");

    System.out.println("Escolha o numero que voce deseja fazer !");
    System.out.println("1 = depositar valor");
    System.out.println("2 = sacar valor ");
    System.out.println("3 = Obter saldo disponivel");
    int operacao = scanner.nextInt();
    
    switch (operacao)
    
    {
        case 1 :
        { 
            
            System.out.print("Digite o numero que deseja depositar : ");   
            double depositar = scanner.nextDouble();
            contagBancaria.setDeposito(depositar);
            double saldoFinal = numeroUm + depositar;
            System.out.println("Deposito feito com sucesso");
            System.out.println("novo saldo : " + saldoFinal);

        }

        case 2 : 
        {

            System.out.print("Digite o numero que deseja sacar : ");   
            double sacar = scanner.nextDouble();
            contagBancaria.setDeposito(sacar);
            double saldoFinal = numeroUm - sacar;
            System.out.println("Deposito feito com sucesso");
            System.out.println("novo saldo : " + saldoFinal);


        }

        case 3 : { System.out.println("Saldo disponivel : " + numeroUm); }





        break;
    }











   
   
   
   
        scanner.close();    
    
    
    
    
    
    }





}
