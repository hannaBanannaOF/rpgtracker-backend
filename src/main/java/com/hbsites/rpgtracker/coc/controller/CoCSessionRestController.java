package com.hbsites.rpgtracker.coc.controller;

import com.hbsites.rpgtracker.coc.dto.CoCSessionDTO;
import com.hbsites.rpgtracker.coc.service.CoCSessionService;
import com.hbsites.rpgtracker.core.interfaces.CRUDRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/coc/sessions")
public class CoCSessionRestController implements CRUDRestController<CoCSessionDTO, CoCSessionDTO, UUID, CoCSessionDTO > {
    @Autowired
    @Lazy
    private CoCSessionService sessionService;

    @Override
    public List<CoCSessionDTO> getAll() {
        return sessionService.getAll();
    }

    @Override
    public CoCSessionDTO create(CoCSessionDTO payload) {
        return sessionService.create(payload);
    }

    @Override
    public CoCSessionDTO getOne(UUID uuid) {
        return sessionService.getById(uuid);
    }

    @Override
    public CoCSessionDTO update(UUID uuid, CoCSessionDTO dto) {
        return sessionService.update(uuid, dto);
    }

    @Override
    public void delete(UUID uuid) {
        sessionService.deleteById(uuid);
    }
}
