package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Operadora implements Iterable<Cliente> {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Operadora(Cliente... clientes) {
        this.clientes = Arrays.asList(clientes);
    }

    @Override
    public Iterator<Cliente> iterator() {
        return clientes.iterator();
    }
}

