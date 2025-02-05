package services;

public class Client {
    private String nome;
    private String conta;
    private Double saldo;
    

     public Client(String nome, String conta, Double saldo){
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String status(){
        return """
                ***********************
                Dados iniciais do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(nome, conta, saldo);
    }

    public double getSaldo(){
        return saldo;
    }

    public void receberValor(double valor){
        saldo += valor;
    }

    public void transferirValor(double valor){
        if(saldo > 0 && saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Transferencia negada: Saldo insuficiente");
        }
    }

}
