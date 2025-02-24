package io.github.jeli01.securitystudy.auth.controller;

import io.github.jeli01.securitystudy.auth.dto.JoinDTO;
import io.github.jeli01.securitystudy.auth.service.JoinService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {
        joinService.joinProcess(joinDTO);
        return "ok";
    }
}
