package com.canturet.diabetestrackingsystemws.controller;

import com.canturet.diabetestrackingsystemws.payload.request.TestCreateRequest;
import com.canturet.diabetestrackingsystemws.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/getTestsByUserId/{username}")
    public ResponseEntity<?> getTestsByUsername(@PathVariable("username") String username) {
        return ResponseEntity.ok(testService.getTestsByUsername(username));
    }

    @PostMapping("/createTest")
    public ResponseEntity<?> createTest(@Valid @RequestBody TestCreateRequest testCreateRequest) throws IOException {
        return ResponseEntity.ok(testService.createTest(testCreateRequest));
    }

    @DeleteMapping("/deleteTest/{id}")
    public ResponseEntity<?> deleteTest(@PathVariable("id") Long id) {
        return ResponseEntity.ok(testService.deleteTest(id));
    }

}
