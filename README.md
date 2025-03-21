# 🍻 Sextou API

API para gerenciar bares, playlists e promoções para animar sua sexta-feira! 

## 🚀 Funcionalidades

### 🏪 Bares e Churrasquinhos
- Listagem de estabelecimentos próximos
- Informações detalhadas como endereço e telefone
- Indicação de locais com churrasquinho

### 🎵 Playlists
- Sugestões de playlists por gênero musical
- Links diretos para o Spotify
- Curadoria especial para cada momento

### 🎉 Promoções
- Ofertas especiais de bebidas
- Preços promocionais
- Indicação dos estabelecimentos participantes

## 🛠️ Tecnologias

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database
- SpringDoc OpenAPI (Swagger)

## 📋 Pré-requisitos

- Java 17 ou superior
- Maven

## 🔧 Instalação

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/sextou-api.git
```

2. Entre no diretório:
```bash
cd sextou-api
```

3. Execute o projeto:
```bash
mvn spring-boot:run
```

## 📚 Documentação da API

Após iniciar o projeto, acesse:

- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/api-docs

## 🔍 Endpoints

### Bares
```
GET /bares - Lista todos os bares
POST /bares - Cadastra um novo bar
```

### Playlists
```
GET /playlists - Lista todas as playlists
POST /playlists - Cadastra uma nova playlist
```

### Promoções
```
GET /promocoes - Lista todas as promoções
POST /promocoes - Cadastra uma nova promoção
```

## 🗄️ Banco de Dados

O projeto utiliza H2 Database (em memória). Console disponível em:
```
http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:sextoudb
User: sa
Password: [vazio]
```

## 🤝 Contribuindo

1. Faça o fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## ✨ Dados Iniciais

O sistema já vem com dados de exemplo incluindo:
- 3 bares com diferentes localizações
- 3 playlists de diferentes gêneros musicais
- 3 promoções ativas em diferentes estabelecimentos

---

Feito com ❤️ para animar suas sextas-feiras! 🎉
