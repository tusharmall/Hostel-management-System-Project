package in.co.hostel.management.service;

import in.co.hostel.management.entity.Warden;
import in.co.hostel.management.dao.WardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardenService {

    @Autowired
    private WardenRepository wardenRepository;

    public List<Warden> getAllWardens() {
        return wardenRepository.findAll();
    }

    public Warden saveWarden(Warden warden) {
        return wardenRepository.save(warden);
    }

    public void deleteWarden(Long id) {
        wardenRepository.deleteById(id);
    }
}
