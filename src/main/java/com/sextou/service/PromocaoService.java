package com.sextou.service;

import com.sextou.model.Promocao;
import com.sextou.repository.PromocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PromocaoService {
    @Autowired
    private PromocaoRepository promocaoRepository;
    
    public List<Promocao> listarTodas() {
        return promocaoRepository.findAll();
    }
    
    public Promocao salvar(Promocao promocao) {
        return promocaoRepository.save(promocao);
    }
}