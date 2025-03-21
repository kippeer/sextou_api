package com.sextou.service;

import com.sextou.model.Bar;
import com.sextou.repository.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BarService {
    @Autowired
    private BarRepository barRepository;
    
    public List<Bar> listarTodos() {
        return barRepository.findAll();
    }
    
    public Bar salvar(Bar bar) {
        return barRepository.save(bar);
    }
}