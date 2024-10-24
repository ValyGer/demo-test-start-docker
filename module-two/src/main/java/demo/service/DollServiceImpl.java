package demo.service;

import demo.dto.Doll;
import org.springframework.stereotype.Service;

@Service
public class DollServiceImpl implements DollService {
    @Override
    public Doll getDoll() {
        Doll doll = new Doll("Barby", "Barby");
        return doll;
    }
}
