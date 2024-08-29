package org.example;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class ClienteUtils {


    public static Integer isClienteInativo(Operadora operadora) {
        LocalDate hoje = LocalDate.now();
        int quantidade = 0;
        for (Cliente cliente : operadora) {
            if (cliente.getDataUltimaRecarga().plusMonths(3).isBefore(hoje)) {
                quantidade++;
            }
        }
        return quantidade;
    }


    public static Integer contarClientes(Operadora operadora) {
        int quantidade = 0;
        for (Iterator a = operadora.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}

