package mx.unam.aragon.ico.te.musicamvc.controladores;

import mx.unam.aragon.ico.te.musicamvc.modelos.Libro;
import mx.unam.aragon.ico.te.musicamvc.servicios.LibroService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Libreria")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/libro/")
    public String libro(Model model) {
        Libro libro = new Libro("Historia del Rock", 1985, "Música", 1,
                "https://upload.wikimedia.org/wikipedia/commons/9/96/Freddie_Mercury_%281977_Press_Kit_Photo%29.jpg", "Freddie Mercury");
        model.addAttribute("libro", libro);
        return "libro";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("libro", new Libro("Título Ejemplo", 2023, "Género", 0, "http:algo", "Autor Ejemplo"));
        return "formLibro";
    }


    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Libro libro) {
        LoggerFactory.getLogger(getClass()).info("Guardando libro: " + libro);
        libroService.guardarLibro(libro);
        return "redirect:/Libreria/nuevo?exito";
    }


    @GetMapping("/libro/{id}")
    public String libro(@PathVariable Integer id, Model model) {
        model.addAttribute("libro", libroService.getLibro(id));
        return "libro";
    }

    @GetMapping("/lista")
    public String listarLibros(Model model) {
        model.addAttribute("libros", libroService.obtenerTodosLosLibros());
        return "listaLibros"; // nombre del archivo HTML que vamos a crear
    }

}
