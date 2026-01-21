package org.example.springbootapp1.controllers;

import org.example.springbootapp1.models.ClientRequest;
import org.example.springbootapp1.models.ClientResponse;
import org.example.springbootapp1.models.RandomId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class JsonController {
    private String generateId() {
        Random random = new Random();
        int id = 100000 + random.nextInt(900000);
        int part1 = id / 1000;
        int part2 = id % 1000;
        return String.format("%03d %03d", part1, part2);
    }

    @GetMapping("/message")
    public RandomId createId() {
        RandomId randomId = new RandomId(generateId());
        return randomId;
    }

    @PostMapping("/client")
    public ResponseEntity<ClientResponse> sendConfirm(@RequestBody ClientRequest request) {
        String orgId = request.getData().getOrgId();
        ClientResponse response = new ClientResponse(true, orgId);
        return ResponseEntity.ok(response);
    }



}

