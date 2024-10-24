package demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Doll {
    private String name;
    private String manufacture;
}
