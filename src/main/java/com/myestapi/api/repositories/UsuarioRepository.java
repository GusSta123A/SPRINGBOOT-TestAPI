package com.myestapi.api.repositories;

import java.util.ArrayList;

import com.myestapi.api.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
