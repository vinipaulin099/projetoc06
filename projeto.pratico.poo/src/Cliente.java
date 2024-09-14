public class Cliente {

    String nome;
    long cpf;
    float totalCompra = 0;
    //Computador computador[] = new Computador[10]

    public void calculaTotalCompra(float preco){
        this.totalCompra += preco;
        System.out.println("Total da sua compra foi de: " +totalCompra);

    }

}
