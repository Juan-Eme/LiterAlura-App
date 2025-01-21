package com.alura.literalura.service;

import com.alura.literalura.model.Autor;
import com.alura.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service

public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarAutores(){
        return autorRepository.findAllConLibros();
    }

    public List<Autor> listarAutoresVivosEnElAno(int ano){
        return autorRepository.findAutoresVivosEnElAnoConLibros(ano);
    }
    public Autor crearAutor(Autor autor){
        return autorRepository.save(autor);
    }
    public Optional<Autor> obtenerAutorPorId(Long id){
        return autorRepository.findById(id);
    }
    public Optional<Autor> obtenerAutorPorNombre(String nombre){
        return autorRepository.findByNombre(nombre);
    }
    public Autor actualizarAutor(Long id, Autor autorDetalles){
        Autor autor = autorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lo siento, no encontramos ese autor"));
        autor.setNombre(autorDetalles.getNombre());
        autor.setAnoDeNacimiento(autorDetalles.getAnoDeNacimiento());
        autor.setAnoDeFallecimiento(autorDetalles.getAnoDeFallecimiento());
        return autorRepository.save(autor);
    }

    public void eliminarAutor(Long id){
        autorRepository.deleteById(id);
    }



}
