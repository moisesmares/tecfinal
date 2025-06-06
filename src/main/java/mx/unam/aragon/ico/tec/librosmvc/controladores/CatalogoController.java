package mx.unam.aragon.ico.tec.librosmvc.controladores;

import mx.unam.aragon.ico.tec.librosmvc.modelos.libro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libreria")
public class CatalogoController {
    @GetMapping("/catalogo")
        public String mostrarCatalogo(){
            return "catalogo";
        }

    @GetMapping("/libro")
    public String mostrarLibro(Model model){
        Libro libro = new Libro("Cien Años de Soledad","Macondo","Gabriel Garcia Marquez","Diana","9786070728792", "https://www.elsotano.com/sotano_covers/9786070/9786070728792.jpg");
        model.addAttribute("libro", libro);
        return "libro";
    }


    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("autor", new Autor("Las Batallas en el Desierto","Carlitos se enamora","José Emilio Pacheco","Era","9786070728792","https://www.elsotano.com/sotano_covers/9786070/9786070728792.jpg"));
        return "formArtista";
    }

    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute Autor autor
    ) {
                LoggerFactory.getLogger(getClass()).info("Guardando autor +  " + autor);
        // mandarlo a BD (save)
        autorService.guardarAutor(autor);
        return "redirect:/libreria/nuevo?exito";
    }

    @GetMapping("/autor/{id}")
    public String autor(@PathVariable Integer id, Model model) {
        model.addAttribute("autor",autorService.getAutor(id));
        return "autor";
    }

}

}

