package org.example.service;

import org.example.model.Visit;

import java.time.LocalDate;
import java.util.List;

interface SearchService {
    List<Visit> searchVisit(LocalDate date);
}