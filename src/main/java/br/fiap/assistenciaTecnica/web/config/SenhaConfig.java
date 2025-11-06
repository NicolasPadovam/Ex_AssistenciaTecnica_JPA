package br.fiap.assistenciaTecnica.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// Serve para que retorne as configurações de proteção de senha
@Configuration
public class SenhaConfig {
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder(12);
    }
}
