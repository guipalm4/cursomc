package com.guiPalma.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guiPalma.cursomc.domain.Categoria;
import com.guiPalma.cursomc.repositories.CategoriaRepository;
import com.guiPalma.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}


