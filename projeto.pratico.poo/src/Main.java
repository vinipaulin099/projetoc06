import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        int menu;
        int memoria;
        int pc1Comprado = 0;
        int pc2Comprado = 0;
        int pc3Comprado = 0;
        float compra = 0;

        computador1.marca = "Positivo";
        computador1.preco = 436;
        for (int i = 1; i < 4; i++){

        }
        computador1.hardwareBasico.nome = "Pentium core i3";
        computador1.hardwareBasico.capacidade = 2200;
        computador1.sistemaOperacional.nome = "Linux Ubuntu";
        computador1.sistemaOperacional.tipo = 32;

        computador2.marca = "Acer";
        computador2.preco = 1670;
        computador2.hardwareBasico.nome = "Pentium core i5";
        computador2.hardwareBasico.capacidade = 3370;
        computador2.sistemaOperacional.nome = "Windows 8";
        computador2.sistemaOperacional.tipo = 64;

        computador3.marca = "Vaio";
        computador3.preco = 6114;
        computador3.hardwareBasico.nome = "Pentium core i7";
        computador3.hardwareBasico.capacidade = 4500;
        computador3.sistemaOperacional.nome = "Windows 10";
        computador3.sistemaOperacional.tipo = 64;

        System.out.println("\n Bem vindo a PC Mania, estamos com algumas promoções" );
        System.out.println(" Antes, precisamos que nos forneça seu nome e seu cpf");

        cliente.nome = scanner.nextLine();
        cliente.cpf = scanner.nextLong();
        System.out.println("\n confira alguns PCs em promoção:");

        System.out.println("\n");
        System.out.println("---------------PROMOÇÃO---------------");
        computador1.mostraPCConfigs();
        System.out.println("Valor: " +computador1.preco);
        System.out.println("---------------PROMOÇÃO---------------");
        computador2.mostraPCConfigs();
        System.out.println("Valor: " +computador2.preco);
        System.out.println("---------------PROMOÇÃO---------------");
        computador3.mostraPCConfigs();
        System.out.println("Valor: " +computador3.preco);

        do {
            System.out.println("---------------------------------------------------------------\n");
            System.out.println("Digite 1 para aproveitar as ofertas da Promoção 1");
            System.out.println("Digite 2 para aproveitar as ofertas da Promoção 2");
            System.out.println("Digite 3 para aproveitar as ofertas da Promoção 3");
            System.out.println("Digite 0 caso não queira comprar nada ou queira finalizar as compras\n");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:

                    System.out.println(" Deseja adicionar memoria USB sem custos adicionais?\n Temos a opçao de 1 Pen Drive de 16Gb para este PC\n (1 para sim e 0 para não)\n");
                    memoria = scanner.nextInt();
                    if (memoria == 1) {
                        MemoriaUSB musb = new MemoriaUSB();
                        musb.nome = "Pen Drive";
                        musb.capacidade = 16;
                        computador1.addMemoria(musb);
                    }
                    pc1Comprado = 1;
                    compra +=computador1.preco;

                    break;
                case 2:

                    System.out.println(" Deseja adicionar memoria USB sem custos adicionais?\n Temos a opçao de 1 Pen Drive de 32Gb para este PC\n (1 para sim e 0 para não)\n");
                    memoria = scanner.nextInt();
                    if (memoria == 1) {
                        MemoriaUSB musb = new MemoriaUSB();
                        musb.nome = "Pen Drive";
                        musb.capacidade = 32;
                        computador2.addMemoria(musb);
                    }
                    pc2Comprado = 1;
                    compra +=computador2.preco;

                    break;
                case 3:

                    System.out.println(" Deseja adicionar memoria USB sem custos adicionais?\n Temos a opçao de 1 HD externo de 1Tb para este PC\n (1 para sim e 0 para não)\n");
                    memoria = scanner.nextInt();
                    if (memoria == 1) {
                        MemoriaUSB musb = new MemoriaUSB();
                        musb.nome = "HD Externo";
                        musb.capacidade = 1;
                        computador3.addMemoria(musb);
                    }
                    pc3Comprado = 1;
                    compra +=computador3.preco;

                    break;
                case 0:
                    System.out.println("compras finalziadas");
                    System.out.println("---------------------------------------------------------------\n");
                    System.out.println("Obrigado pela atenção sr(a). "+cliente.nome);
                    System.out.println(cliente.cpf);
                    System.out.println("Aqui estão suas aquisições: ");

                    if (pc1Comprado > 0){
                        computador1.mostraPCConfigs();
                    }
                    if (pc2Comprado > 0){
                        computador2.mostraPCConfigs();
                    }
                    if (pc3Comprado > 0){
                        computador3.mostraPCConfigs();
                    }

                    cliente.calculaTotalCompra(compra);

                    break;
                default:
                    System.out.println("ATENÇÃO! Opção inválida, tente novamente.\n");
                    break;
            }

            } while (menu != 0);


    }
}