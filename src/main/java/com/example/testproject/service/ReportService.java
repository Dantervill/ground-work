package com.example.testproject.service;

import com.example.testproject.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository repository;

    @Transactional
    public void sendReport(Long id) {
        System.out.println(id + " sent");
        repository.updatePublished(id);
    }
}
