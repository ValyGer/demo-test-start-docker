package demo.service;

import demo.dto.Doll;
import org.springframework.stereotype.Service;

@Service
public interface DollService {
    Doll getDoll();
}
