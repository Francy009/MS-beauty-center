package com.beauty.msbeautycenter.service.clienti;

import com.beauty.msbeautycenter.model.Clienti;

import java.util.List;

public interface ClientiService {
    Clienti getClienteById(Integer idCliente) throws Exception;

    List<Clienti> getListaClientiByNomeAndCognome(String nome, String cognome) throws Exception;
}
