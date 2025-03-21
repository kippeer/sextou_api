package com.sextou.controller;

import com.sextou.model.Promocao;
import com.sextou.service.PromocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/promocoes")
public class PromocaoController {
    @Autowired
    private PromocaoService promocaoService;
    
    @GetMapping
    public ResponseEntity<List<Promocao>> listarTodas() {
        return ResponseEntity.ok(promocaoService.listarTodas());
    }
    
    @PostMapping
    public ResponseEntity<Promocao> criar(@RequestBody Promocao promocao) {
        return ResponseEntity.ok(promocaoService.salvar(promocao));
    }
}