package mx.unam.aragon.ico.tec.librosmvc.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libreria/")
public class CatalogoController {
    @GetMapping("/catalogo")
        public String mostrarCatalogo(){
            return "catalogo";
        }
    }

