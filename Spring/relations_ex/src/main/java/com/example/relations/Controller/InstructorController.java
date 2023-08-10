package com.example.relations.Controller;

import com.example.relations.dto.InstructorDto;
import com.example.relations.dto.LectureDto;
import com.example.relations.entity.Instructor;
import com.example.relations.entity.Lecture;
import com.example.relations.repo.InstructorRepository;
import com.example.relations.repo.InstructorRepositorySupport;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j
@RestController
@RequestMapping("instructors")
@RequiredArgsConstructor
public class InstructorController {
    private final InstructorRepository instructorRepository;

    @PostMapping
    public InstructorDto createInstructor(
            @RequestBody InstructorDto instructorDto) {
        return InstructorDto.fromEntity(
                instructorRepository.save(instructorDto.newEntity()));
    }

    @GetMapping
    public List<InstructorDto> readAllInstructors() {
        List<InstructorDto> instructorList = new ArrayList<>();
        for (Instructor instructor: instructorRepository.findAll())
            instructorList.add(InstructorDto.fromEntity(instructor));
        return instructorList;
    }

    @GetMapping("{id}")
    public InstructorDto readInstructor(@PathVariable("id") Long id) {
        Optional<Instructor> optional
                = instructorRepository.findById(id);
        if (optional.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return InstructorDto.fromEntity(optional.get());
    }

    @GetMapping("{id}/lectures")
    public List<LectureDto> readInstructorLectures(
            @PathVariable("id") Long id
    ) {
        List<LectureDto> lectureList = new ArrayList<>();
        Optional<Instructor> optionalInstructor
                = instructorRepository.findById(id);
        if (optionalInstructor.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        Instructor instructor
                = optionalInstructor.get();

        for (Lecture lecture: instructor.getLectures())
            lectureList.add(LectureDto.fromEntity(lecture));
        return lectureList;
    }

    private final InstructorRepositorySupport instructorRepositorySupport;

    @GetMapping("test")
    public void test() {
        List<Instructor> instructors = instructorRepositorySupport
                .findByFirstName("Christopher");
        for (Instructor instructor: instructors) {
            log.info(instructor.getLastName());
        }
        instructors = instructorRepositorySupport
                .findByFirstNameOrLastName("Romero");
        for (Instructor instructor: instructors) {
            log.info(instructor.getFirstName());
        }
    }
}
