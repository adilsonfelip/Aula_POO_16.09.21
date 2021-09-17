package sextoprojeto;

import java.util.Arrays;

public class ExemploJogo {

    public static void main(String[] args) {

        Faca faca = new Faca();
        Revolver revolver = new Revolver();
        LancaChamas lancaChamas = new LancaChamas();
        Bazuca bazuca = new Bazuca();

        Arma armas[] = {faca, revolver, lancaChamas, bazuca};
       Arrays.sort(armas);

        agredir(faca);
        agredir(faca);
        agredir(revolver);
        agredir(lancaChamas);
        agredir(bazuca);
        agredir(revolver);
        agredir(revolver);

        atirar(revolver);
        atirar(revolver);
        atirar(lancaChamas);
        atirar(bazuca);

        recarregar(revolver);

        System.out.println("Exibir Dados das Armas");

        for (Arma arma : armas) {
            System.out.println(arma);
        }
    }

    public static void agredir(Arma a) {
        a.golpear();
    }

    public static void atirar(Disparavel d) {

        d.disparar();
    }

    public static void recarregar(Disparavel r) {
        r.recarregar();
    }
}
