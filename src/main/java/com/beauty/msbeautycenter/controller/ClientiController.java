package com.beauty.msbeautycenter.controller;

import com.beauty.msbeautycenter.service.clienti.ClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clienti")
public class ClientiController {
    @Autowired
    private ClientiService clientiService;

    @GetMapping("/{idCliente}")
    public ResponseEntity<?> getClienteById(@PathVariable Integer idCliente) {
        try {
            return new ResponseEntity<>(clientiService.getClienteById(idCliente), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ricerca-cliente")
    public ResponseEntity<?> getListaClientiByNomeAndCognome(@RequestParam String nome, @RequestParam String cognome) {
        try {
            return new ResponseEntity<>(clientiService.getListaClientiByNomeAndCognome(nome, cognome), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
