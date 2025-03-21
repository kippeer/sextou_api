package com.sextou.config;

import com.sextou.model.Bar;
import com.sextou.model.Playlist;
import com.sextou.model.Promocao;
import com.sextou.repository.BarRepository;
import com.sextou.repository.PlaylistRepository;
import com.sextou.repository.PromocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(
            BarRepository barRepository,
            PlaylistRepository playlistRepository,
            PromocaoRepository promocaoRepository
    ) {
        return args -> {
            // Inicializando Bares
            Bar bar1 = new Bar();
            bar1.setNome("Boteco do Zé");
            bar1.setEndereco("Rua das Flores, 123");
            bar1.setTelefone("(11) 99999-1111");
            bar1.setTemChurrasquinho(true);

            Bar bar2 = new Bar();
            bar2.setNome("Bar do João");
            bar2.setEndereco("Avenida Principal, 456");
            bar2.setTelefone("(11) 99999-2222");
            bar2.setTemChurrasquinho(false);

            Bar bar3 = new Bar();
            bar3.setNome("Cervejaria do Pedro");
            bar3.setEndereco("Rua da Alegria, 789");
            bar3.setTelefone("(11) 99999-3333");
            bar3.setTemChurrasquinho(true);

            barRepository.saveAll(Arrays.asList(bar1, bar2, bar3));

            // Inicializando Playlists
            Playlist playlist1 = new Playlist();
            playlist1.setNome("Pagode das Antigas");
            playlist1.setGenero("Pagode");
            playlist1.setLink("https://open.spotify.com/playlist/pagode");

            Playlist playlist2 = new Playlist();
            playlist2.setNome("Sertanejo Universitário");
            playlist2.setGenero("Sertanejo");
            playlist2.setLink("https://open.spotify.com/playlist/sertanejo");

            Playlist playlist3 = new Playlist();
            playlist3.setNome("Rock Nacional");
            playlist3.setGenero("Rock");
            playlist3.setLink("https://open.spotify.com/playlist/rock");

            playlistRepository.saveAll(Arrays.asList(playlist1, playlist2, playlist3));

            // Inicializando Promoções
            Promocao promocao1 = new Promocao();
            promocao1.setDescricao("Dose dupla de caipirinha");
            promocao1.setPreco(new BigDecimal("25.00"));
            promocao1.setBar("Boteco do Zé");
            promocao1.setAtiva(true);

            Promocao promocao2 = new Promocao();
            promocao2.setDescricao("Cerveja em dobro");
            promocao2.setPreco(new BigDecimal("15.00"));
            promocao2.setBar("Bar do João");
            promocao2.setAtiva(true);

            Promocao promocao3 = new Promocao();
            promocao3.setDescricao("Happy Hour - Chopp pela metade do preço");
            promocao3.setPreco(new BigDecimal("10.00"));
            promocao3.setBar("Cervejaria do Pedro");
            promocao3.setAtiva(true);

            promocaoRepository.saveAll(Arrays.asList(promocao1, promocao2, promocao3));
        };
    }
}