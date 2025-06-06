package mx.unam.aragon.ico.te.musicamvc.servicios;

import mx.unam.aragon.ico.te.musicamvc.modelos.Libro;
import mx.unam.aragon.ico.te.musicamvc.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public void guardarLibro(Libro libro) {
        libroRepository.save(libro);
    }

    public Libro getLibro(Integer id) {
        Optional<Libro> optionalLibro = libroRepository.findById(id);
        return optionalLibro.orElse(null);
    }
}
