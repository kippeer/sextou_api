package com.sextou.controller;

import com.sextou.model.Bar;
import com.sextou.service.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bares")
public class BarController {
    @Autowired
    private BarService barService;
    
    @GetMapping
    public ResponseEntity<List<Bar>> listarTodos() {
        return ResponseEntity.ok(barService.listarTodos());
    }
    
    @PostMapping
    public ResponseEntity<Bar> criar(@RequestBody Bar bar) {
        return ResponseEntity.ok(barService.salvar(bar));
    }
}