package com.canturet.diabetestrackingsystemws.service.impl;

import com.canturet.diabetestrackingsystemws.model.Test;
import com.canturet.diabetestrackingsystemws.payload.request.TestCreateRequest;
import com.canturet.diabetestrackingsystemws.repository.TestRepository;
import com.canturet.diabetestrackingsystemws.service.TestService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestRepository testRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Test createTest(TestCreateRequest testCreateRequest) throws IOException {
        Test test = modelMapper.map(testCreateRequest, Test.class);
        return testRepository.save(test);
    }

    @Override
    public List<Test> getTestsByUserId(Long id) {
        return testRepository.findByUserId(id);
    }

    @Override
    public ResponseEntity<?> deleteTest(Long id) {
        testRepository.deleteById(id);
        return ResponseEntity.ok("İşlem başarılı.");
    }
}
