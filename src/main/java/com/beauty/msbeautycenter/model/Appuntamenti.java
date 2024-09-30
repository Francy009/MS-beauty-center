package com.beauty.msbeautycenter.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "appuntamenti")
public class Appuntamenti {
    @Id
    @Column(name = "id_appuntamento", nullable = false)
    private Integer idAppuntamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Clienti idCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servizio")
    private Servizi idServizio;

    @Column(name = "data", nullable = false)
    private LocalDate data;

}