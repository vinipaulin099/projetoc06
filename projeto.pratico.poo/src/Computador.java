public class Computador {

    String marca;
    float preco;
    SistemaOperacional sistemaOperacional = new SistemaOperacional();
    HardwareBasico hardwareBasico = new HardwareBasico();
    MemoriaUSB mUSB = new MemoriaUSB();

    public void mostraPCConfigs() {

        System.out.println("\n");
        System.out.println(" Marca do PC: " + marca);
        System.out.println("Informações sobre o Hardware:");
        System.out.println("  Nome: " + hardwareBasico.nome);
        System.out.println("  Capacidade: " + hardwareBasico.capacidade + "Mhz");
        System.out.println("Informações sobre o sistema operacional:");
        System.out.println("  Nome: " + sistemaOperacional.nome);
        System.out.println("  Tipo: " + sistemaOperacional.tipo + " bits");
        if (mUSB.nome != null) {
            System.out.println("Informações sobre a memoria externa:");
            System.out.println("  Nome: " + mUSB.nome);
            System.out.println("  Capacidade: " + mUSB.capacidade + "Gb");

        }
    }

    public void addMemoria(MemoriaUSB musb) {
        this.mUSB = musb;
    }
}