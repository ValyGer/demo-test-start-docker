package demo.controller;

import demo.dto.Doll;
import demo.service.DollService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("dolls/rest")
@RequiredArgsConstructor
public class DollControllerRest {

    private final DollService dollService;

    @GetMapping
    public ResponseEntity<Doll> getDolls() {
        log.info("Calling the getDoll method");
        Doll doll = dollService.getDoll();
        log.info("Response send from rest controller: status 200");
        return ResponseEntity.ok().body(doll);
    }
}
