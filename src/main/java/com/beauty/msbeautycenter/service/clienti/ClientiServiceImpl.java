package com.beauty.msbeautycenter.service.clienti;

import com.beauty.msbeautycenter.model.Clienti;
import com.beauty.msbeautycenter.repository.ClientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientiServiceImpl implements ClientiService {

    @Autowired
    private ClientiRepository clientiRepository;


    @Override
    public Clienti getClienteById(Integer idCliente) throws Exception {
        Optional<Clienti> cliente = clientiRepository.findClientiByIdCliente(idCliente);
        if (cliente.isPresent()) {
            return cliente.get();
        }
        throw new Exception("Cliente non trovato");
    }

    @Override
    public List<Clienti> getListaClientiByNomeAndCognome(String nome, String cognome) throws Exception {
        List<Clienti> listaClienti = clientiRepository.findClientiByNomeIgnoreCaseAndCognomeIgnoreCase(nome, cognome);
        if (!listaClienti.isEmpty()) {
            return listaClienti;
        }
        throw new Exception("Cliente non trovato");
    }

    @Override
    public List<Clienti> getAllClienti() throws Exception {
        List<Clienti> listaClienti = clientiRepository.findAll();  // Recupera tutti i clienti
        if (!listaClienti.isEmpty()) {
            return listaClienti;  // Restituisce la lista se non è vuota
        }
        throw new Exception("Nessun cliente trovato");  // Lancia un'eccezione se non ci sono clienti
    }

}
