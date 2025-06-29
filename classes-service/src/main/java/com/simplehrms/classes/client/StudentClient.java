package com.simplehrms.classes.client;

import com.simplehrms.classes.dto.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class StudentClient {

    private final RestClient restClient;

    public StudentResponse getStudentById(Long id) {
        return restClient.get()
                .uri("http://students-service/api/students/" + id)
                .retrieve()
                .body(StudentResponse.class);
    }

    @Bean
    @LoadBalanced
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }
}