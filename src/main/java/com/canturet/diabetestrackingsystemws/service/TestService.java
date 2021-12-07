package com.canturet.diabetestrackingsystemws.service;

import com.canturet.diabetestrackingsystemws.model.Test;
import com.canturet.diabetestrackingsystemws.payload.request.TestCreateRequest;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

public interface TestService {
    Test createTest(TestCreateRequest testCreateRequest) throws IOException;

    List<Test> getTestsByUserId(Long id);

    ResponseEntity<?> deleteTest(Long id);
}
