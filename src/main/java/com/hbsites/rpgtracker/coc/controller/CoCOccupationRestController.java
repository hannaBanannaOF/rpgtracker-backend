package com.hbsites.rpgtracker.coc.controller;

import com.hbsites.rpgtracker.coc.dto.CoCOccupationCreateDTO;
import com.hbsites.rpgtracker.coc.dto.CoCOccupationDetailDTO;
import com.hbsites.rpgtracker.coc.dto.CoCOccupationListingDTO;
import com.hbsites.rpgtracker.coc.service.CoCOccupationService;
import com.hbsites.rpgtracker.core.interfaces.CRUDRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/coc/occupations")
public class CoCOccupationRestController implements CRUDRestController<CoCOccupationListingDTO , CoCOccupationDetailDTO, UUID, CoCOccupationCreateDTO> {

    @Autowired
    @Lazy
    private CoCOccupationService occupationService;

    @Override
    public List<CoCOccupationListingDTO> getAll() {
        return occupationService.getAll();
    }

    @Override
    public CoCOccupationDetailDTO create(CoCOccupationCreateDTO payload) {
        return occupationService.create(payload);
    }

    @Override
    public CoCOccupationDetailDTO getOne(UUID uuid) {
        return occupationService.getById(uuid);
    }

    @Override
    public CoCOccupationDetailDTO update(UUID uuid, CoCOccupationCreateDTO dto) {
        return occupationService.update(uuid, dto);
    }

    @Override
    public void delete(UUID uuid) {
        occupationService.deleteById(uuid);
    }
}
