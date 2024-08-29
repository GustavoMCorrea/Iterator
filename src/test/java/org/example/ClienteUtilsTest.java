package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ClienteUtilsTest {

    @Test
    void deveContarClienteInativos() {
        Operadora operadora = new Operadora(
                new Cliente("Maria Silva", "(11) 98765-4321", "123.456.789-00", LocalDate.of(2024, 7, 1)),
                new Cliente("João Souza", "(21) 91234-5678", "987.654.321-00", LocalDate.of(2023, 12, 1)),
                new Cliente("Ana Lima", "(31) 99876-5432", "456.789.123-00", LocalDate.of(2023, 10, 28))
        );
        assertEquals(2, ClienteUtils.isClienteInativo(operadora));
    }

    @Test
    void deveContarTotalClientes() {
        Operadora operadora = new Operadora(
                new Cliente("Maria Silva", "(11) 98765-4321", "123.456.789-00", LocalDate.of(2024, 4, 1)),
                new Cliente("João Souza", "(21) 91234-5678", "987.654.321-00", LocalDate.of(2023, 12, 1)),
                new Cliente("Ana Lima", "(31) 99876-5432", "456.789.123-00", LocalDate.of(2023, 10, 28))
        );
        assertEquals(3, ClienteUtils.isClienteInativo(operadora));
    }
}