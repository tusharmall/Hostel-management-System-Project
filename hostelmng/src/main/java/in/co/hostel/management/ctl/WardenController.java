package in.co.hostel.management.ctl;

import in.co.hostel.management.entity.Warden;
import in.co.hostel.management.service.WardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WardenController {

    @Autowired
    private WardenService wardenService;

    @GetMapping("/warden-list")
    public String wardenList(Model model) {
        List<Warden> wardens = wardenService.getAllWardens();
        model.addAttribute("wardens", wardens);
        return "warden-list";
    }

    @PostMapping("/add-warden-form")
    public String addWarden(@ModelAttribute("warden") Warden warden) {
        wardenService.saveWarden(warden);
        return "redirect:/warden-list";
    }

    @GetMapping("/delete-warden/{id}")
    public String deleteWarden(@PathVariable Long id) {
        wardenService.deleteWarden(id);
        return "redirect:/warden-list";
    }
}
